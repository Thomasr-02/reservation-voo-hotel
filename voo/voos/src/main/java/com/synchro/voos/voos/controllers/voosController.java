package com.synchro.voos.voos.controllers;

import com.synchro.voos.voos.models.voos;
import com.synchro.voos.voos.repository.voosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/voos")
public class voosController {
    @Autowired
    private voosRepository voos;

    @GetMapping(path = "")
    public @ResponseBody Iterable<voos> listVoos() {
      return voos.findAll();
    }

    
}