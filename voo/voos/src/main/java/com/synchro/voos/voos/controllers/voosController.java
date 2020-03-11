package com.synchro.voos.voos.controllers;

import java.util.List;

import com.synchro.voos.voos.repository.voosRepository;

import com.synchro.voos.voos.models.voos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/voos")
public class voosController {
    @Autowired
    private voosRepository voos;

    
    @GetMapping(path="")
    public @ResponseBody List<voos> listVoos() {
      return voos.findAll();
    }

    @GetMapping(path={"/{id}"})
    public @ResponseBody Object listVoosID(@PathVariable Long id) {
      return voos.findById(id);
    }
   
    
    @PostMapping(path="") 
    public @ResponseBody Object salvar(@RequestBody voos VOOS) {
      return voos.save(VOOS);
    }

    @DeleteMapping(path={"/{id}"})
    public @ResponseBody void delete(@PathVariable Integer id) {
      voos.deleteById(id);
    }

    // @PutMapping({"/{id}"})
    // public @ResponseBody Object atualizar(@PathVariable Integer id,@RequestBody voos VOOS) {
    //   voos.update(id,VOOS);
    //   return new ResponseEntity<voos>(VOOS, HttpStatus.OK);
    // }


}
