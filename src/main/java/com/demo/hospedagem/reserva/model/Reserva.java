package com.demo.hospedagem.reserva.model;

import com.demo.hospedagem.cliente.model.Cliente;
import com.demo.hospedagem.pagamento.model.Pagamento;
import com.demo.hospedagem.quarto.model.Quarto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@Data
@AllArgsConstructor
public class Reserva{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id_reserva;

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private Cliente cliente;


    @ManyToOne
    @JoinColumn(name = "id_pagamento", referencedColumnName = "id_pagamento")
    private Pagamento pagamento;


   private LocalDate data_check_in;
   private LocalDate data_check_out;
   private String status;
   private BigDecimal valor_total;
   private LocalDate data_criacao;

   @OneToMany
   @JoinColumn(name = "reserva_quarto", referencedColumnName =("id_reserva"))
   private List<Quarto> quartos;


    public Reserva(LocalDate data_check_in, LocalDate data_check_out, LocalDate data_criacao, Cliente cliente, Pagamento pagamento, int id_reserva, List<Quarto> quartos, String status, BigDecimal valor_total) {
        this.data_check_in = data_check_in;
        this.data_check_out = data_check_out;
        this.data_criacao = data_criacao;
        this.id_reserva = id_reserva;
        this.quartos = quartos;
        this.status = status;
        this.valor_total = valor_total;
    }

}
