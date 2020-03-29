package com.synchro.hotel.hotel.controllers;

import com.synchro.hotel.hotel.models.user;
import com.synchro.hotel.hotel.repository.userRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
@RequestMapping(path = "/users")

public class userController {
    @Autowired
    private userRepository UserRepository;
    @GetMapping(path = "")
    public @ResponseBody  Iterable<user>  getAllUser() {
        return UserRepository.findAll();
    }
    
    @GetMapping(path = "/{id}")
    public @ResponseBody Object getHotelByID(@PathVariable final Integer id) {
        return UserRepository.findById(id);

    }
    

    @PostMapping(path = "")
    public @ResponseBody Object addHotel(@RequestBody final user User) {
        return UserRepository.save(User);
    }


    @DeleteMapping(path = "/{id}")
    public @ResponseBody String deleteHotel(@PathVariable final Integer id ){
        UserRepository.deleteById(id);
        return "User deletado!";
    }




//getters and setters
    public userRepository getUserRepository() {
        return UserRepository;
    }

    public void setUserRepository(final userRepository userRepository) {
        this.UserRepository = userRepository;
    }

}