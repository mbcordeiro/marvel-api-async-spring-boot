package com.matheuscordeiro.marvelapiasyncservices.services.interfaces;

import com.matheuscordeiro.marvelapiasyncservices.dtos.CharacterDTO;
import com.matheuscordeiro.marvelapiasyncservices.models.CharacterData;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface CharacterService {
    List<CharacterData> findAllCharacters() throws InterruptedException, ExecutionException;

    CharacterData findCharacterById(Long id) throws InterruptedException, ExecutionException;
}
