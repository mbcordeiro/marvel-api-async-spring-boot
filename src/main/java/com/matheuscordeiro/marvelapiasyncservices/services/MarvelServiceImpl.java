package com.matheuscordeiro.marvelapiasyncservices.services;

import com.matheuscordeiro.marvelapiasyncservices.models.CharacterData;
import com.matheuscordeiro.marvelapiasyncservices.services.interfaces.MarvelService;
import com.matheuscordeiro.marvelapiasyncservices.utils.UrlBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Service
public class MarvelServiceImpl implements MarvelService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MarvelService.class);
    private static final String BASE_URL = "http://gateway.marvel.com/v1/public/";

    private final RestTemplate restTemplate;

    public MarvelServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Async
    @Override
    public CompletableFuture<CharacterData> findCharacters() throws InterruptedException {
        String url = UrlBuilder.urlBuilder(BASE_URL, "characters");
        LOGGER.debug("Amigo estou aqui => " + url);
        LOGGER.info("Amigo estou aqui => " + url);
        CharacterData data = restTemplate.getForObject(url, CharacterData.class);
        LOGGER.info("Request is start");
        Thread.sleep(1000);
        LOGGER.info("Request is done");
        return CompletableFuture.completedFuture(data);
    }

    @Async
    @Override
    public CompletableFuture<CharacterData> findCharacterById(Long id) throws InterruptedException {
        StringBuilder paramUrl = new StringBuilder();
        String url = UrlBuilder.urlBuilder(BASE_URL, paramUrl.append("characters/").append(id).toString());
        LOGGER.debug("Amigo estou aqui => " + url);
        LOGGER.info("Amigo estou aqui => " + url);
        LOGGER.info("Request is start");
        CharacterData data = restTemplate.getForObject(url, CharacterData.class);
        Thread.sleep(1000);
        LOGGER.info("Request is done");
        return CompletableFuture.completedFuture(data);
    }
}
