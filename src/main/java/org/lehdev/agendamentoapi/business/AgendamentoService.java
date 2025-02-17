package org.lehdev.agendamentoapi.business;

import lombok.RequiredArgsConstructor;
import org.lehdev.agendamentoapi.business.mapper.IAgendamentoMapper;
import org.lehdev.agendamentoapi.controller.dto.in.AgendamentoRecord;
import org.lehdev.agendamentoapi.controller.dto.out.AgendamentoRecordOut;
import org.lehdev.agendamentoapi.infrastructure.repositories.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

//@RequiredArgsConstructor
@Service
@ComponentScan(basePackages = "org.lehdev.agendamentoapi.business.mapper")
public class AgendamentoService {

    private final AgendamentoRepository repository;
    private final IAgendamentoMapper agendamentoMapper;

    @Lazy
    @Autowired
    public AgendamentoService(IAgendamentoMapper agendamentoMapper, AgendamentoRepository repository) {
        this.agendamentoMapper = agendamentoMapper;
        this.repository = repository;
    }

    public AgendamentoRecordOut gravarAgendamento(AgendamentoRecord agendamento) {
        return agendamentoMapper.paraOut(
                repository.save(
                        agendamentoMapper.paraEntity(agendamento)));
    }

    public AgendamentoService(AgendamentoRepository repository, IAgendamentoMapper agendamentoMapper) {
        this.repository = repository;
        this.agendamentoMapper = agendamentoMapper;
    }
}
