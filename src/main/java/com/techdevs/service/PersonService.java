package com.techdevs.service;

import com.techdevs.entity.Person;
import com.techdevs.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;


    public List<Person> getAll(){
        return personRepository.findAll();
    }

    public Optional<Person> getById(int id){
        return  personRepository.findById(id);
    }
}
