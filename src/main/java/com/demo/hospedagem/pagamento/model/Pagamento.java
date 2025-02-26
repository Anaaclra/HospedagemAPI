package com.demo.hospedagem.pagamento.model;

<<<<<<< HEAD
import com.demo.hospedagem.reserva.model.Reserva;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;
=======
import lombok.AllArgsConstructor;
import lombok.Data;
>>>>>>> origin/main

import java.math.BigDecimal;
import java.time.LocalDate;

<<<<<<< HEAD
@Entity
=======
@Data
@AllArgsConstructor
>>>>>>> origin/main
public class Pagamento {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id_pagamento;

    @OneToOne
    @JoinColumn(name = "id_reserva", referencedColumnName = "id_reserva")
    private Reserva reserva;

    private LocalDate data_pagamento;
    private BigDecimal valor_pago;
    private String metodo_pagamento;
    private String status_pagamento;

<<<<<<< HEAD
    public Pagamento(Integer id_pagamento, Reserva reserva, LocalDate data_pagamento, BigDecimal valor_pago, String metodo_pagamento, String status_pagamento) {
        this.id_pagamento = id_pagamento;
        this.data_pagamento = data_pagamento;
        this.valor_pago = valor_pago;
        this.metodo_pagamento = metodo_pagamento;
        this.status_pagamento = status_pagamento;
    }

    public Integer getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(Integer id_pagamento) {
        this.id_pagamento = id_pagamento;
    }


    public LocalDate getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(LocalDate data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public BigDecimal getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(BigDecimal valor_pago) {
        this.valor_pago = valor_pago;
    }

    public String getMetodo_pagamento() {
        return metodo_pagamento;
    }

    public void setMetodo_pagamento(String metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }

    public String getStatus_pagamento() {
        return status_pagamento;
    }

    public void setStatus_pagamento(String status_pagamento) {
        this.status_pagamento = status_pagamento;
    }
}
=======
}
>>>>>>> origin/main
