package com.techdevs;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "movie")

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private int genreId;
    private int runningTime;
    private int directorId;
    private String synopsis;
    private String languageId;

    public Movie() {
    }

    public Movie(long id, String title, int genreId, int runningTime, int directorId, String synopsis, String languageId) {
        this.id = id;
        this.title = title;
        this.genreId = genreId;
        this.runningTime = runningTime;
        this.directorId = directorId;
        this.synopsis = synopsis;
        this.languageId = languageId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public int getDirectorId() {
        return directorId;
    }

    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getLanguageId() {
        return languageId;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }
}
