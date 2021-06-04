package com.matheuscordeiro.marvelapiasyncservices.controllers;

import com.matheuscordeiro.marvelapiasyncservices.dtos.CharacterDTO;
import com.matheuscordeiro.marvelapiasyncservices.services.interfaces.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/character")
public class CharacterController {
    @Autowired
    CharacterService characterService;

    @GetMapping
    public ResponseEntity<List<CharacterDTO>> getAllCharacters() {
        return ResponseEntity.ok(characterService.findAllCharacters());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CharacterDTO> getCharactersById(@PathVariable  Long id) {
        return ResponseEntity.ok(characterService.findCharacter(id));
    }
}
