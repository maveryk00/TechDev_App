package com.techdevs.service;

import com.techdevs.entity.Genre;
import com.techdevs.repository.GenreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class GenreService {

    private final GenreRepository genreRepository;


    public List<Genre> getAll(){
        return genreRepository.findAll();
    }

    public Optional<Genre> getById(int id){
        return  genreRepository.findById(id);
    }
}
