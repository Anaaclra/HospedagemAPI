package com.demo.hospedagem.quarto.model;



import com.demo.hospedagem.categoria.model.Categoria;
import jakarta.persistence.*;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;

@Entity
public class Quarto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_quarto;

    @ManyToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    private Categoria categoria;


    private String tipo;
    private int capacidade;
    private int numero;
    private String status;
    private BigDecimal valor_diaria;

    public Quarto(int capacidade, Categoria categoria, int id_quarto, int numero, String status, String tipo, BigDecimal valor_diaria) {
        this.capacidade = capacidade;
        this.id_quarto = id_quarto;
        this.numero = numero;
        this.status = status;
        this.tipo = tipo;
        this.valor_diaria = valor_diaria;
    }


    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getId_quarto() {
        return id_quarto;
    }

    public void setId_quarto(int id_quarto) {
        this.id_quarto = id_quarto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValor_diaria() {
        return valor_diaria;
    }

    public void setValor_diaria(BigDecimal valor_diaria) {
        this.valor_diaria = valor_diaria;
    }
}
