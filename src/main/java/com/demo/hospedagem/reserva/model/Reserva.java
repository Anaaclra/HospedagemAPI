package com.demo.hospedagem.reserva.model;

import com.demo.hospedagem.cliente.model.Cliente;
import com.demo.hospedagem.pagamento.model.Pagamento;
import com.demo.hospedagem.quarto.model.Quarto;
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
    private Integer id_reserva;

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private Cliente cliente;

    private LocalDate data_check_in;
    private LocalDate data_check_out;
    private String status;
    private BigDecimal valor_total;
    private LocalDate data_criacao;

    @OneToMany(mappedBy = "reserva", cascade = CascadeType.ALL)
    private List<Quarto> quartos;
}