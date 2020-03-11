package com.synchro.hotel.hotel.controllers;

import com.synchro.hotel.hotel.models.compra;
import com.synchro.hotel.hotel.repository.compraRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@RequestMapping(path = "/compras")
public class compraController {
    @Autowired
    private compraRepository CompraRepository;

    @GetMapping(value="")
    public@ResponseBody Iterable<compra> findAllCompras() {
        return CompraRepository.findAll();
    }
    

    @PostMapping(path = "")
    public @ResponseBody Object addCompra(@RequestBody final compra Compra) {
        return CompraRepository.save(Compra);
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Object getComraByID(@PathVariable final Integer id) {
        return CompraRepository.findById(id);

    }



    //getters And setters
    public compraRepository getCompraRepository() {
        return CompraRepository;
    }

    public void setCompraRepository(compraRepository compraRepository) {
        this.CompraRepository = compraRepository;
    }


}