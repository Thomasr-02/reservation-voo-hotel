package com.synchro.voos.voos.services;

import java.util.List;

import com.synchro.voos.voos.models.voos;
import com.synchro.voos.voos.repository.voosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class voosService implements voosRepository {

    // Spring Boot will create and configure DataSource and JdbcTemplate
    // To use it, just @Autowired
    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Override
    public int count() {
        return jdbcTemplate.queryForObject("select count(*) from voos", Integer.class);
    }

    @Override
    public List<voos> findAll() {
        return jdbcTemplate.query("select *from voos", (rs, rowNum) -> new voos(rs.getInt("id"),
                rs.getString("nomeEmp"), rs.getDouble("preco"), rs.getString("origem"), rs.getString("destino"),rs.getString("data_ida"),rs.getString("data_volta") ));
    }

    @Override
    public Object findById(Long id) {
        return jdbcTemplate.query("select *from voos where id=?", (rs, rowNum) -> new voos(rs.getInt("id"),
                rs.getString("nomeEmp"), rs.getDouble("preco"), rs.getString("origem"), rs.getString("destino"),rs.getString("data_ida"),rs.getString("data_volta")),id);
    }


    @Override
    public Object save(final voos Voos) {
        return jdbcTemplate.update("insert into voos (preco,nomeEmp,origem,destino,data_ida,data_volta) values(?,?,?,?,?,?)", Voos.getPreco(),
                Voos.getnomeEmp(), Voos.getOrigem(), Voos.getDestino(),Voos.getData_ida(),Voos.getData_volta());
    }
   
    @Override
    public int deleteById(Integer id) {
        return jdbcTemplate.update("delete from voos where id=?", id);
    }

    // @Override
    // public int update(Integer id, final voos voos) {
    //     return jdbcTemplate.update(
    //             "update from voos set nomeEmp= ?, preco = ?,  origem = ?,  destino = ?  where id=?",
    //             voos.getnomeEmp(), voos.getPreco(), voos.getOrigem(), voos.getDestino(), id);
    // }

   
   

    @Override
    public List<voos> findByOrigemAndDestino(final String Origem, final String Destino) {
       
        return jdbcTemplate.query("select * from voos where origem like ? and destino <= ?",
                new Object[] { "%" + Origem + "%", Destino },
                (rs, rowNum) -> new voos(
                    rs.getInt("id"), 
                    rs.getString("nomeEmp"), 
                    rs.getDouble("preco"),
                    rs.getString("origem"), 
                    rs.getString("destino"), 
                    rs.getString("data_ida"),
                    rs.getString("data_volta")));
    }

    @Override
    public List<voos> findByData_idaAndData_volta(final String data_ida, final String data_volta) {
       
        return jdbcTemplate.query("SELECT * FROM voos WHERE data_ida LIKE ? AND data_volta >= ?",
                new Object[] { "%" + data_ida + "%" , data_volta },
                (rs, rowNum) -> new voos(
                    rs.getInt("id"), 
                    rs.getString("nomeEmp"),
                    rs.getDouble("preco"),
                    rs.getString("origem"), 
                    rs.getString("destino"),
                    rs.getString("data_ida"),
                    rs.getString("data_volta")));
    }




    @Override
    public String getNameById(final Long id) {
        return null;// NAO DISPONIBILIZADO PELA API
    }

    @Override
    public int update(Integer id, voos voos) {
        return 1;// NAO DISPONIBILIZADO PELA API
    }

  
    

}
