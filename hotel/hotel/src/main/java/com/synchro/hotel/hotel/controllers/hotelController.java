package com.synchro.hotel.hotel.controllers;

import com.synchro.hotel.hotel.models.hotel;
import com.synchro.hotel.hotel.repository.hotelRepository;

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
@RequestMapping(path = "/hotel")
public class hotelController {
    @Autowired
    private hotelRepository HOTELRepository;

    @GetMapping(path = "")
    public @ResponseBody  Iterable<hotel>  getAllHotel() {
        return HOTELRepository.findAll();
    }
    @GetMapping(path = "/{id}")
    public @ResponseBody Object getHotelByID(@PathVariable final Integer id) {
        return HOTELRepository.findById(id);

    }
    

    @PostMapping(path = "")
    public @ResponseBody Object addHotel(@RequestBody final hotel hotel) {
        return HOTELRepository.save(hotel);
    }


    @DeleteMapping(path = "/{id}")
    public @ResponseBody String deleteHotel(@PathVariable final Integer id ){
        HOTELRepository.deleteById(id);
        return "Hotel deletado!";
    }

    //corrigir ATUALIZAR HOTEL
    // @PutMapping(path = "/{id}")
    // public @ResponseBody Object updateHotel(@RequestBody hotel hotel,@PathVariable Integer id){
    //     return HOTELRepository.save()
    // }








    //GETTERS AND SETTERS
    public hotelRepository getHOTELRepository() {
        return HOTELRepository;
    }

    public void setHOTELRepository(final hotelRepository hOTELRepository) {
        this.HOTELRepository = hOTELRepository;
    }
}