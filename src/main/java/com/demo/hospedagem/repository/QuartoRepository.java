package com.demo.hospedagem.repository;

import com.demo.hospedagem.entities.Quarto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuartoRepository extends JpaRepository<Quarto, Integer> {
}
