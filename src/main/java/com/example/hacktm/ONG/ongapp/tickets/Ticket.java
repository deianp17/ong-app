package com.example.hacktm.ONG.ongapp.tickets;

import com.example.hacktm.ONG.ongapp.user.User;

public class Ticket{
    private Integer id;

    private User user;

    public Ticket(Integer id, User user) {
        this.id = id;
        this.user = user;
    }

    public Ticket(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
