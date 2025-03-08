package com.demo.hospedagem.pagamento.repository;

import com.demo.hospedagem.pagamento.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Integer, Pagamento> {
}
