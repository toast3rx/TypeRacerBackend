package com.orchid.TypeRacerBackend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "word_value", length = 50)
    private String wordValue;
}
