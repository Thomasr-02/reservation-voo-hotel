package com.synchro.voos.voos.repository;

import java.util.List;

import com.synchro.voos.voos.models.voos;


public interface voosRepository  {
    List<voos> findAll();
    
}
