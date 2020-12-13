package com.bookmyshow.demo.controllers;

import com.bookmyshow.demo.models.Users;
import com.bookmyshow.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookMyShow")
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<Users> get(){
        return userService.get();
    }

    @PostMapping("/user")
    public Users save(@RequestBody Users user){
        userService.save(user);
        return user;
    }

    @GetMapping("/user/{id}")
    public Users get(@PathVariable int id) {
        Users user = userService.get(id);
        if(user == null){
            throw new RuntimeException("\nUser with id: "+id+" doesn't exist.\n");
        }
        else
            return user;
    }

    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable int id) {
        try{
            userService.delete(id);
            return "User wid id: "+id+" has been deleted.";
        }
        catch (Exception e)
        {
            return String.valueOf(e);
        }
    }

    @PutMapping("/user")
    public Users update(@RequestBody Users user){
        try{
            userService.save(user);
            return user;
        }
        catch (Exception e) {
            throw new RuntimeException("\nUser doesn't exist\n");
        }
    }
}
