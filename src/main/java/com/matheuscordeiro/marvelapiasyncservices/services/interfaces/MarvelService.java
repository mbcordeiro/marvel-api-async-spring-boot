package com.matheuscordeiro.marvelapiasyncservices.services.interfaces;

import com.matheuscordeiro.marvelapiasyncservices.dtos.CharacterDTO;

import java.util.concurrent.CompletableFuture;

public interface MarvelService {
    CompletableFuture<CharacterDTO> findCharacter() throws InterruptedException;

    CompletableFuture<CharacterDTO> findCharacterById(Long id) throws InterruptedException;
}
