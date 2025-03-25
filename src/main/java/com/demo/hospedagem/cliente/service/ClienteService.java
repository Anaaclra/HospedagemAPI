package com.demo.hospedagem.cliente.service;


import com.demo.hospedagem.cliente.model.Cliente;
import com.demo.hospedagem.cliente.model.dtos.CadastraClienteDTO;
import com.demo.hospedagem.cliente.repository.ClienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;
    private ModelMapper modelMapper;

    public Cliente cadastraCliente(CadastraClienteDTO cliente) {
        if (!Objects.isNull(clienteRepository.findByCLientePorCpf(cliente.getCpf()))){
         throw new RuntimeException("Cliente já existe");
        }
         Cliente clienteMapeado = modelMapper.map(cliente, Cliente.class);
        return clienteRepository.save(clienteMapeado);
    }


    public Cliente consultaCliente(String cpf, boolean lancaExcecao) {
        Cliente clienteConsultado = clienteRepository.findByCLientePorCpf(cpf);
        if (Objects.isNull(clienteConsultado) && lancaExcecao){
            throw new RuntimeException("Cliente não cadastrado");
        }
        return clienteConsultado;
    }


}
