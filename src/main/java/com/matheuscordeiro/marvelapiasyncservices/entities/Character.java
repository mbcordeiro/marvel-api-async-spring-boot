package com.matheuscordeiro.marvelapiasyncservices.entities;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    @Column(name = "url_image")
    private String urlImage;

    @NotNull
    @Column(name = "url_wiki")
    private String urlWiki;
}
