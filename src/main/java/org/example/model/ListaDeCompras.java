package org.example.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class ListaDeCompras {
    private String id;
    private String nome;
    private String dataCriacao;

    public ListaDeCompras() {
        this.id = UUID.randomUUID().toString();
        this.dataCriacao = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    public ListaDeCompras(String nome) {
        this();
        this.nome = nome;
    }

    public ListaDeCompras(String id, String nome, String dataCriacao) {
        this.id = id;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
