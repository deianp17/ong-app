package com.example.hacktm.ONG.ongapp.user;

import com.example.hacktm.ONG.ongapp.tickets.Ticket;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;

    public static User user1 = new User(1, "Adam" , 19);
    public static User user2 = new User(2, "Eveiona" , 29);
    public static User user3 = new User(3, "Jaconilus" , 13);

    static {
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public List<User> findAll() {
        return users;
    }

    public User addUser(User user){
        if(user.getId() == null)
            user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public User getUserById(int id) {
        for(User user : users){
            if(user.getId() == id)
                return user;
        }
        return null;
    }

    public User deleteUserById(int id) {
        Iterator<User> iterator = users.iterator();

        while(iterator.hasNext()){
            User user = iterator.next();
            if(user.getId() == id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }

    public Ticket addTicket(int id, Ticket ticket){
        for(User user : users){
            if(user.getId() == id){
                user.addTicket(ticket);
                return ticket;
            }
        }
        return null;
    }

}
