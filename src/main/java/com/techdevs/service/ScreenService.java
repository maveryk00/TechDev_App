package com.techdevs.service;

import com.techdevs.entity.Screen;
import com.techdevs.repository.ScreenRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ScreenService {

    private final ScreenRepository screenRepository;


    public List<Screen> getAll(){
        return screenRepository.findAll();
    }

    public Optional<Screen> getById(int id){
        return  screenRepository.findById(id);
    }
}
