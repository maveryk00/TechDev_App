package com.techdevs.service;

import com.techdevs.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;


    public List<CustomerRepository> getAll(){
        return customerRepository.findAll();
    }

    public Optional<CustomerRepository> getById(int id){
        return  customerRepository.findById(id);
    }
}
