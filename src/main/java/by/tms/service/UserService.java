package by.tms.service;

import by.tms.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final List<User> users = new ArrayList<>();

    public void save(User user){
        users.add(user);
    }

    public User findByUserName(String username){
        for (User user : users) {
            if (user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }
}
