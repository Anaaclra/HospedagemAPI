package com.demo.hospedagem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_categoria;
    private String nome;
    private String descricao;
    private String status_pagamento;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Beneficio> beneficio;

}
