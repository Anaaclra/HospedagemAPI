package com.demo.hospedagem.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
public class Quarto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_quarto;

    @ManyToOne
    @JoinColumn(name = "id-categoria", referencedColumnName = "id_categoria")
    private Categoria categoria;    //private int id_categoria;

    private String tipo;
    private int capacidade;
    private int numero;
    private String status;
    private BigDecimal valor_diaria;

}