package com.demo.hospedagem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pagamento;

    @OneToOne
    @JoinColumn(name = "id_reserva", referencedColumnName = "id_reserva")
    private Reserva reserva;       //private Integer id_reserva;
    private LocalDate data_pagamento;
    private BigDecimal valor_pago;
    private String metodo_pagamento;
    private String status_pagamento;

}