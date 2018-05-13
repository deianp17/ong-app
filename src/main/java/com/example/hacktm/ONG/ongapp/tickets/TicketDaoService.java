package com.example.hacktm.ONG.ongapp.tickets;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.example.hacktm.ONG.ongapp.user.UserDaoService.user1;
import static com.example.hacktm.ONG.ongapp.user.UserDaoService.user2;

@Component
public class TicketDaoService {
    private static List<Ticket> tickets= new ArrayList<>();

    static {
        tickets.add(new Ticket(1 , user1));
        tickets.add(new Ticket(2 , user2));
    }

    public List<Ticket> getAllTickets(){
        return tickets;
    }

    public Ticket getTicketById(int id) {
        for(Ticket ticket : tickets)
            if(ticket.getId() == id)
                return ticket;
        return null;
    }

    public Ticket addTicket(Ticket ticket){
        tickets.add(ticket);
        return ticket;
    }

    public Ticket deleteTicketById(int id) {
        Iterator<Ticket> iterator = tickets.iterator();
        while(iterator.hasNext()){
            Ticket ticket = iterator.next();
            if(ticket.getId() == id){
                iterator.remove();
                return ticket;
            }
        }
        return null;

    }


}
