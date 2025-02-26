package com.demo.hospedagem.categoria.model;

import com.demo.hospedagem.beneficio.model.Beneficio;
<<<<<<< HEAD
import jakarta.persistence.*;

import java.util.List;

@Entity
=======
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
>>>>>>> origin/main
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_categoria;
    private String nome;
    private String descricao;
    private String status_pagamento;

    @OneToOne (mappedBy = "categoria" , cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Beneficio> beneficio;

}
