package com.demo.hospedagem.cliente.resource;

import com.demo.hospedagem.cliente.model.Cliente;
import com.demo.hospedagem.cliente.model.dtos.CadastraClienteDTO;
import com.demo.hospedagem.cliente.service.ClienteService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "clientes")
@AllArgsConstructor
public class ClienteResource {

    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> cadastraCliente(@Valid @RequestBody CadastraClienteDTO cliente){
        return ResponseEntity.ok().body(clienteService.cadastraCliente(cliente));
    }

    @GetMapping
    public ResponseEntity<Cliente> consultaCliente(String cpf){
        return ResponseEntity.ok().body(clienteService.consultaCliente(cpf, true));
    }

}
