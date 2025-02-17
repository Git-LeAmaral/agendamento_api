package org.lehdev.agendamentoapi.controller;

import lombok.RequiredArgsConstructor;
import org.lehdev.agendamentoapi.business.AgendamentoService;
import org.lehdev.agendamentoapi.controller.dto.in.AgendamentoRecord;
import org.lehdev.agendamentoapi.controller.dto.out.AgendamentoRecordOut;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agendamento")
public class AgendamentoController {

    private final AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<AgendamentoRecordOut> gravarAgendamentos(@RequestBody AgendamentoRecord agendamento) {
        return ResponseEntity.ok(agendamentoService.gravarAgendamento(agendamento));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AgendamentoRecordOut> buscarAgendamentoPorId(@PathVariable ("id") Long id) {
        return ResponseEntity.ok(agendamentoService.buscarAgendamentosPorId(id));
    }
/*
    public AgendamentoController(AgendamentoService agendamentoService) {
        this.agendamentoService = agendamentoService;
    }*/
}
