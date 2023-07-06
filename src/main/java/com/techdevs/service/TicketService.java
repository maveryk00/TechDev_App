package com.techdevs.service;

import com.techdevs.entity.Ticket;
import com.techdevs.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class TicketService {

    private final TicketRepository ticketRepository;


    public List<Ticket> getAll(){
        return ticketRepository.findAll();
    }

    public Optional<Ticket> getById(int id){
        return  ticketRepository.findById(id);
    }
}
