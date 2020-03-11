package com.synchro.voos.voos.controllers;

import com.synchro.voos.voos.models.voos;
import com.synchro.voos.voos.reopsitory.voosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/voos")
public class voosController {
  @Autowired
  private voosRepository VoosRepository;

  @GetMapping(path = "")
  public @ResponseBody Iterable<voos> listVoos() {
    return VoosRepository.findAll();
  }



  //getters and setters
  public voosRepository getVoosRepository() {
    return VoosRepository;
  }

  public void setVoosRepository(final voosRepository voosRepository) {
    this.VoosRepository = voosRepository;
  }

    
}