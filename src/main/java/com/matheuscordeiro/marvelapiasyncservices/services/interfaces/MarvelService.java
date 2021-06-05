package com.matheuscordeiro.marvelapiasyncservices.services.interfaces;

import com.matheuscordeiro.marvelapiasyncservices.dtos.CharacterDTO;
import com.matheuscordeiro.marvelapiasyncservices.models.CharacterData;

import java.util.concurrent.CompletableFuture;

public interface MarvelService {
    CompletableFuture<CharacterData> findCharacters() throws InterruptedException;

    CompletableFuture<CharacterData> findCharacterById(Long id) throws InterruptedException;
}
