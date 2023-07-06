package com.techdevs.service;

import com.techdevs.entity.District;
import com.techdevs.repository.DistrictRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class DistrictService {

    private final DistrictRepository districtRepository;


    public List<District> getAll(){
        return districtRepository.findAll();
    }

    public Optional<District> getById(int id){
        return  districtRepository.findById(id);
    }
}
