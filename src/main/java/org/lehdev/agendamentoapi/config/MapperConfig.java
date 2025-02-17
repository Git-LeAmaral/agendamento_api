package org.lehdev.agendamentoapi.config;

import org.lehdev.agendamentoapi.business.mapper.IAgendamentoMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    public IAgendamentoMapper agendamentoMapper() {
        return Mappers.getMapper(IAgendamentoMapper.class);
    }
}
