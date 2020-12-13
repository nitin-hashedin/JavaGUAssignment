package com.bookmyshow.demo.service;

import com.bookmyshow.demo.models.Users;

import java.util.List;

public interface UserService {
    List<Users> get();

    Users get(int id);

    void save(Users user);

    void delete(int id);
}
