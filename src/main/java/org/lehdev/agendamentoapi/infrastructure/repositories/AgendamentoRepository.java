package org.lehdev.agendamentoapi.infrastructure.repositories;

import org.lehdev.agendamentoapi.infrastructure.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
