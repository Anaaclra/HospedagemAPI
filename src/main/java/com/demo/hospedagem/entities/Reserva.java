package com.demo.hospedagem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reserva;

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private Cliente cliente;    //private int id_cliente;

    @ManyToOne
    @JoinColumn(name = "id_pagamento", referencedColumnName = "id_pagamento")
    private Pagamento pagamento;   // private int id_pagamento;

    private LocalDate data_check_in;
    private LocalDate data_check_out;
    private String status;
    private BigDecimal valor_total;
    private LocalDate data_criacao;

    @OneToMany
    @JoinColumn(name = "reserva_quarto", referencedColumnName = "id_reserva")
    private List<Quarto> quartos;

}