package com.bookmyshow.demo.models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Data
@Table(name="CONCERT")
public class Concert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;

    @Column(name="title")
    private String title;

    @Column(name="venue")
    private String venue;

    @Column(name="date")
    private Date date;

    @Column(name="time")
    private Time time;

    @Column(name="seats")
    private int seats;

    @Column(name="price")
    private float price;
}
