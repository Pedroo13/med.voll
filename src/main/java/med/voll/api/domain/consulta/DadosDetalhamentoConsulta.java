package med.voll.api.domain.consulta;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.time.LocalDateTime;

public record DadosDetalhamentoConsulta(Long id,
                                        @JsonAlias({"medico_id", "id_medico"}) Long idMedico,
                                        @JsonAlias({"paciente_id", "id_paciente"})Long idPaciente,
                                        LocalDateTime data) {

    public DadosDetalhamentoConsulta(Consulta consulta) {
        this(consulta.getId(), consulta.getMedico().getId(), consulta.getPaciente().getId(), consulta.getData());
    }
}
