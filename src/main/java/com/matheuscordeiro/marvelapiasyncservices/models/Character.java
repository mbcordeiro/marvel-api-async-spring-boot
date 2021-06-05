package com.matheuscordeiro.marvelapiasyncservices.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Character {
    private Long id;

    private String name;

    private String description;

    private Thumbnail thumbnail;
}
