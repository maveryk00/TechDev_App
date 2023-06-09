package com.techdevs.service;

import com.techdevs.entity.Address;
import com.techdevs.repository.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class AddressService {

    private final AddressRepository addressRepository;


    public Optional<Address> getById(int id) {
        return addressRepository.findById(id);
    }

}
