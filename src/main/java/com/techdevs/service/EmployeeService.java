package com.techdevs.service;

import com.techdevs.entity.Employee;
import com.techdevs.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;


    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> getById(int id){
        return  employeeRepository.findById(id);
    }
}
