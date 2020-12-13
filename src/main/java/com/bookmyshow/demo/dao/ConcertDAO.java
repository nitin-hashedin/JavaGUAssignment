package com.bookmyshow.demo.dao;

import com.bookmyshow.demo.models.Concert;

import java.util.List;

public interface ConcertDAO {
    List<Concert> get();

    Concert get(int id);

    void save(Concert concert);

    void delete(int id);
}
