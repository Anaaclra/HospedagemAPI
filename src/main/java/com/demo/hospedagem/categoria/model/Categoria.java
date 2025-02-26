package com.demo.hospedagem.categoria.model;

import com.demo.hospedagem.beneficio.model.Beneficio;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_categoria;
    private String nome;
    private String descricao;
    private String status_pagamento;

    @OneToOne (mappedBy = "categoria" , cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Beneficio> beneficio;

    public Categoria(Integer id_categoria, String nome, String descricao, String status_pagamento, List<Beneficio> beneficio) {
        this.id_categoria = id_categoria;
        this.nome = nome;
        this.descricao = descricao;
        this.status_pagamento = status_pagamento;
        this.beneficio = beneficio;

    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus_pagamento() {
        return status_pagamento;
    }

    public void setStatus_pagamento(String status_pagamento) {
        this.status_pagamento = status_pagamento;
    }

    public List<Beneficio> getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(List<Beneficio> beneficio) {
        this.beneficio = beneficio;
    }
}
