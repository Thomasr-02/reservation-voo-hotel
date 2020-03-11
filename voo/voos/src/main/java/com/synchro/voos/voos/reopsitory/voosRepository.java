package com.synchro.voos.voos.reopsitory;

import java.util.List;

import com.synchro.voos.voos.models.voos;

import org.springframework.stereotype.Repository;

@Repository
public interface voosRepository  {
    List<voos> findAll();
    
}
