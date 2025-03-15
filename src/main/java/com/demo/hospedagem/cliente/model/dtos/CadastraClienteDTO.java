package com.demo.hospedagem.cliente.model.dtos;

import com.demo.hospedagem.endereco.model.Endereco;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
public class CadastraClienteDTO {

    @NotNull(message = "Nome obrigatório")
    @Size(min = 3, max = 100, message = "Número min de caractere 3 e máximo 100.")
    private String nome;

    @NotNull
    private String email;

    @NotNull
    private String cpf;

    @NotNull
    private String telefone;

    @NotNull
    private LocalDate data_de_nascimento;

    @NotNull
    private List<Endereco> enderecos;

}
