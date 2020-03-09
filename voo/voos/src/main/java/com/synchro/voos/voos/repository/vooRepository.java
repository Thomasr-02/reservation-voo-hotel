package com.synchro.voos.voos.repository;

import java.util.List;

import com.synchro.voos.voos.models.voo;

public interface vooRepository  {

    int count();

    List<voo> findAll();
    
    Object save(voo voos);

   

}
