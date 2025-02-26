package com.demo.hospedagem.beneficio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

@Entity
public class Beneficio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_beneficio;
    private String nome;
    private String descricao;

}