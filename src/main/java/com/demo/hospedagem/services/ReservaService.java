package com.demo.hospedagem.services;

import com.demo.hospedagem.entities.Reserva;
import com.demo.hospedagem.repository.ReservaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {
    private final ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public List<Reserva> listarTodas() {
        return reservaRepository.findAll();
    }

    public Reserva buscarPorId(int id) {
        return reservaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reserva não encontrada"));
    }

    public Reserva salvar(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public void deletar(int id) {
        reservaRepository.deleteById(id);
    }
}
