package com.techdevs.service;

import com.techdevs.entity.City;
import com.techdevs.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CityService {

    private final CityRepository cityRepository;


    public List<City> getAll(){
        return cityRepository.findAll();
    }

    public Optional<City> getById(int id){
        return  cityRepository.findById(id);
    }
}
