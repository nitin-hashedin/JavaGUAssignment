package com.bookmyshow.demo.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="USERS")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

    @Column(name="username")
    private String userName;

    @Column(name="email", unique=true)
    private String email;
}
