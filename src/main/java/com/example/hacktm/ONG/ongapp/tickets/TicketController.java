package com.example.hacktm.ONG.ongapp.tickets;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {

    @Autowired
    private TicketDaoService service;

    @GetMapping("/tickets")
    public List<Ticket> retrieveAllTickets(){
        return service.getAllTickets();
    }



}
