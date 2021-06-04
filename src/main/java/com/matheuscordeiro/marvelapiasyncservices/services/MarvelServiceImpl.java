package com.matheuscordeiro.marvelapiasyncservices.services;

import com.matheuscordeiro.marvelapiasyncservices.dtos.CharacterDTO;
import com.matheuscordeiro.marvelapiasyncservices.services.interfaces.MarvelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

public class MarvelServiceImpl implements MarvelService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MarvelService.class);
    private static final String BASE_URL = "http://gateway.marvel.com/v1/public/";

    private final RestTemplate restTemplate;

    public MarvelServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Async
    @Override
    public CompletableFuture<CharacterDTO> findCharacter() throws InterruptedException {
        StringBuilder stringBuilder = new StringBuilder();
        String url = stringBuilder.append(BASE_URL).append("characters").toString();
        CharacterDTO characterDTO = restTemplate.getForObject(url, CharacterDTO.class);
        Thread.sleep(1000);
        return CompletableFuture.completedFuture(characterDTO);
    }

    @Async
    @Override
    public CompletableFuture<CharacterDTO> findCharacterById(Long id) throws InterruptedException {
        StringBuilder stringBuilder = new StringBuilder();
        String url = stringBuilder.append(BASE_URL).append("characters/").append(id).toString();
        CharacterDTO characterDTO = restTemplate.getForObject(url, CharacterDTO.class);
        Thread.sleep(1000);
        return CompletableFuture.completedFuture(characterDTO);
    }
}
