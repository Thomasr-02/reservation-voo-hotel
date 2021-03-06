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
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins= "http://localhost:3000")
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
    public @ResponseBody Object listVoosID(@PathVariable final Long id) {
      return voos.findById(id);
    }

    @PostMapping(path = "")
    public @ResponseBody Object salvar(@RequestBody final voos VOOS) {
      return voos.save(VOOS);
    }

    @GetMapping(path = "/origem/{origem}/destino/{destino}")
    public @ResponseBody List<voos> pesquisarFilter(@PathVariable final String origem,
        @PathVariable final String destino) {

      return voos.findByOrigemAndDestino(origem, destino);
    }

    @GetMapping(path = "/data_ida/{data_ida}/data_volta/{data_volta}")
    public @ResponseBody List<voos> pesquisarFilterDate(@PathVariable final String data_ida,
        @PathVariable final String data_volta) {

      return voos.findByData_idaAndData_volta(data_ida, data_volta);
    }

    @GetMapping(path = "/data_ida/{data_ida}/data_volta/{data_volta}/origem/{origem}/destino/{destino}")
    public @ResponseBody List<voos> pesquisarAll(@PathVariable final String data_ida,
        @PathVariable final String data_volta, @PathVariable final String origem, @PathVariable final String destino) {

      return voos.pesquisarAll(data_ida, data_volta, origem, destino);
    }

    // rota local/
    /*
     * @PostMapping(path="/filter") public @ResponseBody Object salvar(@RequestBody
     * voos VOOS) { return voos.save(VOOS); }
     */

    @DeleteMapping(path = { "/{id}" })
    public @ResponseBody void delete(@PathVariable final Integer id) {
      voos.deleteById(id);
    }

    // @PutMapping({"/{id}"})
    // public @ResponseBody Object atualizar(@PathVariable Integer id,@RequestBody voos VOOS) {
    //   voos.update(id,VOOS);
    //   return new ResponseEntity<voos>(VOOS, HttpStatus.OK);
    // }


}
