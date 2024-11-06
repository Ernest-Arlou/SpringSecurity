package com.example.securingweb;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@AllArgsConstructor

public class SecuringWebApplication {

    private MyService myService;

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(SecuringWebApplication.class, args);
    }

    @GetMapping("/hello1")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/user")
    public String addUser(@RequestBody MyUser user) {
        System.out.println("Controller: addUser");
        System.out.println(user);
        myService.addUser(user);
        return "success";
    }


}
