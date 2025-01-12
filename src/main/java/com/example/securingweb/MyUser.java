package com.example.securingweb;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users_t")
public class MyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String username;
    private String password;
    private String roles;
}
