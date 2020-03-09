package com.synchro.voos.voos.services;

import java.util.List;

import com.synchro.voos.voos.models.voos;
import com.synchro.voos.voos.repository.voosRepository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class voosService implements voosRepository {

    public JdbcTemplate jdbcTemplate;

    @Override
    public List<voos> findAll() {
        return jdbcTemplate.query("select *from voos", (rs, rowNum) ->
        new voos(
            rs.getInt("id"),
            rs.getString("nome"),
            rs.getLong("preco"),
            rs.getString("origem"),
            rs.getString("destino"),
            rs.getString("data")
        ));
    }

   
    


}