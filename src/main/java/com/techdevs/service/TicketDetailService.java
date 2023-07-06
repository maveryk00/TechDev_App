package com.techdevs.service;

import com.techdevs.entity.TicketDetail;
import com.techdevs.repository.TicketDetailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class TicketDetailService {

    private final TicketDetailRepository ticketDetailRepository;


    public List<TicketDetail> getAll(){
        return ticketDetailRepository.findAll();
    }

    public Optional<TicketDetail> getById(int id){
        return  ticketDetailRepository.findById(id);
    }
}
