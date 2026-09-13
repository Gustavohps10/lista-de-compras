package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Estabelecimento {
    private String id;
    private String nome;
    private List<String> diasSemanaPromocao;

    public Estabelecimento() {
        this.id = UUID.randomUUID().toString();
        this.diasSemanaPromocao = new ArrayList<>();
    }

    public Estabelecimento(String nome, List<String> diasSemanaPromocao) {
        this();
        this.nome = nome;
        this.diasSemanaPromocao = diasSemanaPromocao != null ? diasSemanaPromocao : new ArrayList<>();
    }

    public Estabelecimento(String id, String nome, List<String> diasSemanaPromocao) {
        this.id = id;
        this.nome = nome;
        this.diasSemanaPromocao = diasSemanaPromocao != null ? diasSemanaPromocao : new ArrayList<>();
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

    public List<String> getDiasSemanaPromocao() {
        return diasSemanaPromocao;
    }

    public void setDiasSemanaPromocao(List<String> diasSemanaPromocao) {
        this.diasSemanaPromocao = diasSemanaPromocao;
    }

    public String getDiasFormatados() {
        if (diasSemanaPromocao == null || diasSemanaPromocao.isEmpty()) {
            return "Nenhum dia informado";
        }
        return String.join(", ", diasSemanaPromocao);
    }
}
