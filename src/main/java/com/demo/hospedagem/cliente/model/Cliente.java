package com.demo.hospedagem.cliente.model;

import com.demo.hospedagem.endereco.model.Endereco;
import com.demo.hospedagem.reserva.model.Reserva;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cliente;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private LocalDate data_de_nascimento;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Reserva> reservas;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY) //coloquei OneToMany porque pode ter mais de uma opção de endereço (karine)
    @JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco")
    private Endereco endereco;


}
