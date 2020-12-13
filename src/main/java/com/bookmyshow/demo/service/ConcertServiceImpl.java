package com.bookmyshow.demo.service;

import com.bookmyshow.demo.dao.ConcertDAO;
import com.bookmyshow.demo.models.Concert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ConcertServiceImpl implements ConcertService {

    @Autowired
    private ConcertDAO concertDAO;

    @Transactional
    @Override
    public List<Concert> get() {
        return concertDAO.get();
    }

    @Transactional
    @Override
    public Concert get(int id) {
        return concertDAO.get(id);
    }

    @Transactional
    @Override
    public void save(Concert concert) {
        concertDAO.save(concert);
    }

    @Transactional
    @Override
    public void delete(int id) {
        concertDAO.delete(id);
    }
}
