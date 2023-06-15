package com.techdevs.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "movie")
public class Movie {

    public enum Language{
        ESP, SUB
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    @Column(name = "genreId")
    private int genreId;
    @Column(name = "runningTime")
    private int runningTime;
    private String synopsis;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Language language;

}
