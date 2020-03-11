package com.synchro.voos.voos.repository;

import java.util.List;

import com.synchro.voos.voos.models.voos;

import org.springframework.stereotype.Repository;

@Repository
public interface voosRepository  {
    int count();
    List<voos> findAll();
    
}
