package com.synchro.voos.voos.models;

//import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class voos {

    private Long id;
    private String nome_emp;
    private BigDecimal preco;
    private String origem;
    private String destino;


    public voos(){
        super();
    }
    public voos(final long id, final String nome_emp, final BigDecimal preco,final String origem, final String destino) {
        super();
        this.id=id;
        this.nome_emp=nome_emp;
        this.preco=preco;
        this.origem=origem;
        this.destino=destino;
    }

    public Long getId() {
        return id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(final String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(final String origem) {
        this.origem = origem;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(final BigDecimal preco) {
        this.preco = preco;
    }

    public String getnome_emp() {
        return nome_emp;
    }

    public void setName(final String nome_emp) {
        this.nome_emp = nome_emp;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    //... setters getters constructors...
}
