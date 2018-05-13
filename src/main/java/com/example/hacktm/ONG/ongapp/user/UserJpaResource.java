package com.example.hacktm.ONG.ongapp.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserJpaResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/jpa/users")
    public List<User> retrieveAllUser(){
        return userRepository.findAll();
    }

    @GetMapping("/jpa/users/{id}")
    public Optional<User> retrieveOneUser(@PathVariable int id){
        Optional<User> user = userRepository.findById(id);

        if(!user.isPresent())
            throw new RuntimeException("Id -" + id);

        return user;
    }

    
}
