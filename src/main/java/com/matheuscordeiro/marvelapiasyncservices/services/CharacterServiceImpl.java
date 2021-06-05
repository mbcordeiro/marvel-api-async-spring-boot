package com.matheuscordeiro.marvelapiasyncservices.services;

import com.matheuscordeiro.marvelapiasyncservices.dtos.CharacterDTO;
import com.matheuscordeiro.marvelapiasyncservices.models.CharacterData;
import com.matheuscordeiro.marvelapiasyncservices.services.interfaces.CharacterService;
import com.matheuscordeiro.marvelapiasyncservices.services.interfaces.MarvelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    MarvelService marvelService;

    @Override
    public List<CharacterData> findAllCharacters() throws InterruptedException, ExecutionException {
        return Arrays.asList(marvelService.findCharacters().get());
    }

    @Override
    public CharacterData findCharacterById(Long id) throws InterruptedException, ExecutionException {
        return marvelService.findCharacterById(id).get();
    }
}
