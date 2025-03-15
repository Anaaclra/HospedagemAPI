package com.demo.hospedagem.cliente.repository;

import com.demo.hospedagem.cliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query(value = "SELECT * FROM cliente c WHERE cpf = :cpf", nativeQuery = true)
    Cliente findByCLientePorNome(@Param("cpf") String cpf);

}
