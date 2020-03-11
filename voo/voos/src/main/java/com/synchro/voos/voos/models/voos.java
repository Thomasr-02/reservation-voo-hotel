package com.synchro.voos.voos.models;


import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class voos {

    private Long id;
    private String nome_emp;
    private Long preco;
    private String origem;
    private String destino;
    private String data_ida;
    private String data_volta;

    public voos() {
        super();
    }

    public String getData_volta() {
        return data_volta;
    }

    public void setData_volta(String data_volta) {
        this.data_volta = data_volta;
    }

    public String getData_ida() {
        return data_ida;
    }

    public void setData_ida(String data_ida) {
        this.data_ida = data_ida;
    }

    public voos(final long id, final String nome_emp, final Long preco, final String origem, final String destino,final String data_ida,final String data_volta) {
        super();
        this.id = id;
        this.nome_emp = nome_emp;
        this.preco = preco;
        this.origem = origem;
        this.destino = destino;
        this.data_ida= data_ida;
        this.data_volta=data_volta;
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

    public Long getPreco() {
        return preco;
    }

    public void setPreco(final Long preco) {
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
