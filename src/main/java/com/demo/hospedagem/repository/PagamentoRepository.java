package com.demo.hospedagem.repository;

import com.demo.hospedagem.entities.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Integer, Pagamento> {
}
