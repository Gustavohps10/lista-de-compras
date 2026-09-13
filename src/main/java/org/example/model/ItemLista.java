package org.example.model;

import java.util.UUID;

public class ItemLista {
    private String id;
    private String listaId;
    private String estabelecimentoId; // Opcional segundo [RF014]
    private String produtoId;
    private double quantidade;
    private double valorUnitario; // [RF016]
    private boolean comprado;

    public ItemLista() {
        this.id = UUID.randomUUID().toString();
        this.quantidade = 1.0;
        this.valorUnitario = 0.0;
        this.comprado = false;
    }

    public ItemLista(String listaId, String estabelecimentoId, String produtoId, double quantidade, double valorUnitario) {
        this();
        this.listaId = listaId;
        this.estabelecimentoId = estabelecimentoId;
        this.produtoId = produtoId;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getListaId() {
        return listaId;
    }

    public void setListaId(String listaId) {
        this.listaId = listaId;
    }

    public String getEstabelecimentoId() {
        return estabelecimentoId;
    }

    public void setEstabelecimentoId(String estabelecimentoId) {
        this.estabelecimentoId = estabelecimentoId;
    }

    public String getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(String produtoId) {
        this.produtoId = produtoId;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    public double getSubtotal() {
        return quantidade * valorUnitario;
    }
}
