package com.example.hacktm.ONG.ongapp.user;


import com.example.hacktm.ONG.ongapp.tickets.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserDaoService service;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        service.addUser(user);
        return user;
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        User user = service.getUserById(id);
        return user;
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        User user = service.deleteUserById(id);
    }

    @GetMapping("/users/{id}/tickets")
    public List<Ticket> getAllTickets(@PathVariable int id){
        User user = service.getUserById(id);
        return user.getTickets();
    }

    @PostMapping("/users/{id}/tickets")
    public Ticket addTicketToUser(@PathVariable int id, @RequestBody Ticket ticket){
        User user = service.getUserById(id);
        user.addTicket(ticket);
        return ticket;
    }

}
