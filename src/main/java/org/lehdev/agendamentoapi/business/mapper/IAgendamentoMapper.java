package org.lehdev.agendamentoapi.business.mapper;

import org.lehdev.agendamentoapi.controller.dto.in.AgendamentoRecord;
import org.lehdev.agendamentoapi.controller.dto.out.AgendamentoRecordOut;
import org.lehdev.agendamentoapi.infrastructure.entities.Agendamento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IAgendamentoMapper {

    //IAgendamentoMapper INSTANCE = Mappers.getMapper(IAgendamentoMapper.class);

    Agendamento paraEntity(AgendamentoRecord agendamentoRecord);

    AgendamentoRecordOut paraOut(Agendamento agendamento);
}
