package com.synchro.hotel.hotel.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class hotel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String cidade;
    private String nome;
    private String descricao;
    private Long preco;



    //GETTERS AND SETTERS
    public Integer getId() {
        return id;
    }

    public Long getPreco() {
        return preco;
    }

    public void setPreco(final Long preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(final String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(final String cidade) {
        this.cidade = cidade;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

}