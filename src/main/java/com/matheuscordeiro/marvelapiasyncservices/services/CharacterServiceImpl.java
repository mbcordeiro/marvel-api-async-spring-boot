package com.matheuscordeiro.marvelapiasyncservices.services;

import com.matheuscordeiro.marvelapiasyncservices.dtos.CharacterDTO;
import com.matheuscordeiro.marvelapiasyncservices.entities.Character;
import com.matheuscordeiro.marvelapiasyncservices.services.interfaces.CharacterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Override
    public List<CharacterDTO> findAllCharacters() {
        return null;
    }

    @Override
    public CharacterDTO findCharacter(Long id) {
        return null;
    }
}
