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
    private Double preco;
    private String url_imagem;


    //GETTERS AND SETTERS
    public Integer getId() {
        return id;
    }
    public String getUrl_imagem() {
        return url_imagem;
    }
    public String setUrl_imagem() {
        return url_imagem;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(final Double preco) {
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