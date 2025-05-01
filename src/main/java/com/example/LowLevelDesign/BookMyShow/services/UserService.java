package com.example.LowLevelDesign.BookMyShow.services;
import com.example.LowLevelDesign.BookMyShow.models.User;
import com.example.LowLevelDesign.BookMyShow.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {


    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signUpUser(String name, String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);

        User user1 = new User();
        if(user.isEmpty()) {
            user1.setEmail(email);
            user1.setName(name);
            user1.setPassword(password);

            userRepository.save(user1);
        } else {
            // throw already exist exception
        }

        return user1;
    }

    // HW
    // Implement Sign in with email Id and pwd
    // Check if the password provided by user and in the db is same
}
