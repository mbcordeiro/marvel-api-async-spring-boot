package com.matheuscordeiro.marvelapiasyncservices.services.interfaces;

import com.matheuscordeiro.marvelapiasyncservices.dtos.CharacterDTO;
import com.matheuscordeiro.marvelapiasyncservices.entities.Character;

import java.util.List;

public interface CharacterService {
    List<CharacterDTO> findAllCharacters();

    CharacterDTO findCharacter(Long id);
}
