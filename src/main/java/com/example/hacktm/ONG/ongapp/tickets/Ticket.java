package com.example.hacktm.ONG.ongapp.tickets;

import com.example.hacktm.ONG.ongapp.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Ticket{

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JsonIgnore
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
