package com.techdevs.service;

import com.techdevs.entity.Screening;
import com.techdevs.repository.ScreeningRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ScreeningService {

    private final ScreeningRepository screeningRepository;


    public List<Screening> getAll(){
        return screeningRepository.findAll();
    }

    public Optional<Screening> getById(int id){
        return  screeningRepository.findById(id);
    }
}
