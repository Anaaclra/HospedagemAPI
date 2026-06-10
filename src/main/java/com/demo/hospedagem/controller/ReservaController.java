package com.demo.hospedagem.controller;

import com.demo.hospedagem.entities.Reserva;
import com.demo.hospedagem.services.ReservaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @GetMapping
    public List<Reserva> listarTodas() {
        return reservaService.listarTodas();
    }

    @GetMapping("/{id}")
    public Reserva buscarPorId(@PathVariable Integer id) {
        return reservaService.buscarPorId(id);
    }

    @PostMapping
    public Reserva criar(@RequestBody Reserva reserva) {
        return reservaService.salvar(reserva);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        reservaService.deletar(id);
    }
}
