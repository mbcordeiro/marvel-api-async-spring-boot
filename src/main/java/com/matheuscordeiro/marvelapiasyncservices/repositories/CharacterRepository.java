package com.matheuscordeiro.marvelapiasyncservices.repositories;

import com.matheuscordeiro.marvelapiasyncservices.entities.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}
