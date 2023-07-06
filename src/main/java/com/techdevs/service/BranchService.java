package com.techdevs.service;

import com.techdevs.entity.Branch;
import com.techdevs.repository.BranchRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BranchService {

    private final BranchRepository branchRepository;

    public List<Branch> getAll() {
        return branchRepository.findAll();
    }

}
