package org.example.model;

import java.util.UUID;

public class Produto {
    private String id;
    private String descricao;
    private String unidadeMedida; // Ex: UN, KG, L, PCT, CX
    private String fotoUrl;

    public Produto() {
        this.id = UUID.randomUUID().toString();
    }

    public Produto(String descricao, String unidadeMedida, String fotoUrl) {
        this();
        this.descricao = descricao;
        this.unidadeMedida = unidadeMedida;
        this.fotoUrl = fotoUrl;
    }

    public Produto(String id, String descricao, String unidadeMedida, String fotoUrl) {
        this.id = id;
        this.descricao = descricao;
        this.unidadeMedida = unidadeMedida;
        this.fotoUrl = fotoUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }
}
