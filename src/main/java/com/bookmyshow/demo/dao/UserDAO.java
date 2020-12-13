package com.bookmyshow.demo.dao;

import com.bookmyshow.demo.models.Users;

import java.util.List;

public interface UserDAO {
    List<Users> get();

    Users get(int id);

    void save(Users user);

    void delete(int id);
}
