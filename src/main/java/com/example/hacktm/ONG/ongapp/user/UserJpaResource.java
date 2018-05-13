package com.example.hacktm.ONG.ongapp.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/jpa/users")
    public User addUser(@RequestBody User user){
        userRepository.save(user);
        return user;
    }




}
