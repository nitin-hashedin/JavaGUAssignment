package com.bookmyshow.demo.models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name="REGISTRATION")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="register_time")
    private Timestamp registerTime;

    @Column(name="status")
    private Status status;

    @Column(name="modified_time")
    private Timestamp modifiedTime;

    @OneToOne
    private Users user;

    @OneToOne
    private Concert concert;
}
