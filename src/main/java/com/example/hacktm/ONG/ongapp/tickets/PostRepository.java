package com.example.hacktm.ONG.ongapp.tickets;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Ticket, Integer> {
}
