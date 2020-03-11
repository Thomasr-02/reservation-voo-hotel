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

    // @Override
    // public Object save(final voos Voos) {
    //     return jdbcTemplate.update("insert into voos (preco,nome_emp,origem,destino) values(?,?,?,?)", Voos.getPreco(),
    //             Voos.getnome_emp(), Voos.getOrigem(), Voos.getDestino());
    // }

    // @Override
    // public int update(Integer id, final voos voos) {
    //     return jdbcTemplate.update(
    //             "update from voos set nome_emp= ?, set preco = ?, set origem = ?, set destino = ?  where id=?",
    //             voos.getnome_emp(), voos.getPreco(), voos.getOrigem(), voos.getDestino(), id);
    // }

    @Override
    public int deleteById(Integer id) {
        return jdbcTemplate.update("delete from voos where id=?", id);
    }

    @Override
    public List<voos> findAll() {
        return jdbcTemplate.query("select *from voos", (rs, rowNum) -> new voos(rs.getInt("id"),
                rs.getString("nome_emp"), rs.getBigDecimal("preco"), rs.getString("origem"), rs.getString("destino")));
    }

    @Override
    public List<voos> findByOrigemAndDestino(final String Destino, final String Origem) {
        return jdbcTemplate.query("select * from voos where origem like ? and destino <= ?",
                new Object[] { "%" + Origem + "%", Destino },
                (rs, rowNum) -> new voos(rs.getInt("id"), rs.getString("nome_emp_Emp"), rs.getBigDecimal("preco"),
                        rs.getString("origem"), rs.getString("destino")));
    }

    /*
     * @Override public voos findById(Long id) {
     * 
     * }
     */

    @Override
    public String getNameById(final Long id) {
        return null;
    }

    @Override
    public Object save(voos voos) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int update(Integer id, voos voos) {
        // TODO Auto-generated method stub
        return 0;
    }

    

}
