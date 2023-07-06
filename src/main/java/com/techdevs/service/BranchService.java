package com.techdevs.service;

import com.techdevs.entity.Branch;
import com.techdevs.repository.BranchRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class BranchService {

    private final BranchRepository branchRepository;

    public List<Branch> getAll() {
        return branchRepository.findAll();
    }

    public Optional<Branch> getById(int id){
        return branchRepository.findById(id);
    }

}
