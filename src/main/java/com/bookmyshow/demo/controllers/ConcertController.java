package com.bookmyshow.demo.controllers;

import com.bookmyshow.demo.models.Concert;
import com.bookmyshow.demo.service.ConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookMyShow")
public class ConcertController {

    @Autowired
    private ConcertService concertService;

    @GetMapping("/concert")
    public List<Concert> get(){
        return concertService.get();
    }

    @PostMapping("/concert")
    public Concert save(@RequestBody Concert concert){
        concertService.save(concert);
        return concert;
    }

    @GetMapping("/concert/{id}")
    public Concert get(@PathVariable int id) {
        Concert concert = concertService.get(id);
        if(concert == null){
            throw new RuntimeException("\nConcert with id: "+id+" doesn't exist.\n");
        }
        else
            return concert;
    }

    @DeleteMapping("/concert/{id}")
    public String delete(@PathVariable int id) {
        try{
            concertService.delete(id);
            return "Concert wid id: "+id+" has been deleted.";
        }
        catch (Exception e)
        {
            return String.valueOf(e);
        }
    }

    @PutMapping("/concert")
    public Concert update(@RequestBody Concert concert){
        try{
            concertService.save(concert);
            return concert;
        }
        catch (Exception e) {
            throw new RuntimeException("\nConcert doesn't exist\n");
        }
    }
}
