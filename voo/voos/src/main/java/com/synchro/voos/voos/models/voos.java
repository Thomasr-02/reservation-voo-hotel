package com.synchro.voos.voos.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class voos {
    private Integer id;
    private String nome_emp;
    private Long preco;
    private String origem;
    private String destino;
    private String data;


    public voos(final Integer id, final String nome_emp, final Long preco, final String origem, final String destino,final String data) {
        super();
        this.setId(id);
        this.setNome_emp(nome_emp);
        this.setPreco(preco);
        this.setOrigem(origem);
        this.setDestino(destino);
        this.setData(data);
    }
    public voos() {
        super();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public Long getPreco() {
        return preco;
    }

    public void setPreco(Long preco) {
        this.preco = preco;
    }

    public String getNome_emp() {
        return nome_emp;
    }

    public void setNome_emp(String nome_emp) {
        this.nome_emp = nome_emp;
    }

  
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}