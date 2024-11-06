package com.example.securingweb;


import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MyService {
    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

    public void addUser(MyUser myUser) {
        myUser.setPassword(passwordEncoder.encode(myUser.getPassword()));
        System.out.println(myUser);
        userRepository.save(myUser);
    }
}
