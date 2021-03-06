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

    List<voos> findByData_idaAndData_volta(String data_ida, String data_volta);
    
    List<voos> pesquisarAll(String data_ida, String data_volta,String Destino, String Origem);
}
