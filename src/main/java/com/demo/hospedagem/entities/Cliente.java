package com.demo.hospedagem.entities;

import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
public class Cliente {

    private Integer id_cliente;
    private String nome;

    @Email
    private String email;

    @CPF
    private String cpf;

    private String telefone;
    private LocalDate data_de_nascimento;
    private List<Reserva> reservas;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL,  orphanRemoval = true)
    private List<Endereco> enderecos;


}
