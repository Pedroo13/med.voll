package med.voll.api.domain.medico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    @Query("""
            select m from medico m
                   where
                   m.especialidade = :especialidade
                   and
                   m.id not in(
                       select c.medico.id from Consulta c
                       where
                       c.data = :data
                   )
                   order by function('random')
                   limit 1
            """)
    Medico escolherMedicoAleatorioLivreNaData(Especialidade especialidade, LocalDateTime data);
}
