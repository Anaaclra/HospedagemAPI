package com.demo.hospedagem.reserva.model;

import com.demo.hospedagem.cliente.model.Cliente;
import com.demo.hospedagem.pagamento.model.Pagamento;
import com.demo.hospedagem.quarto.model.Quarto;
<<<<<<< HEAD
import jakarta.persistence.*;
=======
import lombok.AllArgsConstructor;
import lombok.Data;
>>>>>>> origin/main

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

<<<<<<< HEAD

@Table(name = "reserva")
public class Reserva {

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

    public Reserva() {

    }

    public LocalDate getData_check_in() {
        return data_check_in;
    }

    public void setData_check_in(LocalDate data_check_in) {
        this.data_check_in = data_check_in;
    }

    public LocalDate getData_check_out() {
        return data_check_out;
    }

    public void setData_check_out(LocalDate data_check_out) {
        this.data_check_out = data_check_out;
    }

    public LocalDate getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDate data_criacao) {
        this.data_criacao = data_criacao;
    }



    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getValor_total() {
        return valor_total;
    }

    public void setValor_total(BigDecimal valor_total) {
        this.valor_total = valor_total;
    }
}
=======
@Data
@AllArgsConstructor
public class Reserva {

    private int id_reserva;
    private int id_cliente;
    private int id_pagamento;
    private LocalDate data_check_in;
    private LocalDate data_check_out;
    private String status;
    private BigDecimal valor_total;
    private LocalDate data_criacao;
    private List<Quarto> quartos;

}
>>>>>>> origin/main
