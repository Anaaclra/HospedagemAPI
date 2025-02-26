package com.demo.hospedagem.quarto.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import com.demo.hospedagem.categoria.model.Categoria;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;


@Data
@AllArgsConstructor
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
}

