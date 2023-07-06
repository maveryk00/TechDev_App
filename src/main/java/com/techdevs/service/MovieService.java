package com.techdevs.service;

import com.techdevs.entity.Movie;
import com.techdevs.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class MovieService {

    private final MovieRepository movieRepository;


    public List<Movie> getAll(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getById(int id){
        return  movieRepository.findById(id);
    }
}
