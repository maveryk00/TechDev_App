package com.techdevs.service;

import com.techdevs.entity.Department;
import com.techdevs.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;


    public List<Department> getAll(){
        return departmentRepository.findAll();
    }

    public Optional<Department> getById(int id){
        return  departmentRepository.findById(id);
    }
}
