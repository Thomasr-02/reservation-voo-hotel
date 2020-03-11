package com.synchro.voos.voos.repository;

import java.util.List;

import com.synchro.voos.voos.models.voos;

public interface voosRepository  {

    int count();

    Object save(voos voos);

    int update(Integer id,voos voos);

    int deleteById(Integer id);
    
    List<voos> findAll();

    List<voos> findByOrigemAndDestino(String Destino, String Origem);

    Object findById(Long id);

    String getNameById(Long id);

}
