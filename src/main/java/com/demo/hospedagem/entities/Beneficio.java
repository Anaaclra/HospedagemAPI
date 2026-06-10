package com.demo.hospedagem.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Beneficio {

    private Integer id_beneficio;
    private String nome;
    private String descricao;
}