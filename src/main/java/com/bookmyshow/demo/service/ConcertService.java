package com.bookmyshow.demo.service;

import com.bookmyshow.demo.models.Concert;

import java.util.List;

public interface ConcertService {
    List<Concert> get();

    Concert get(int id);

    void save(Concert concert);

    void delete(int id);
}
