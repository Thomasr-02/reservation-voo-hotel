package com.synchro.voos.voos.models;


import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class voos {

    private Long id;
    private String nomeEmp;
    private Double preco;
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

    public voos(final long id, final String nomeEmp, final Double preco, final String origem, final String destino,final String data_ida,final String data_volta) {
        super();
        this.id = id;
        this.nomeEmp = nomeEmp;
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(final Double preco) {
        this.preco = preco;
    }

    public String getnomeEmp() {
        return nomeEmp;
    }

    public void setName(final String nomeEmp) {
        this.nomeEmp = nomeEmp;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    //... setters getters constructors...
}
