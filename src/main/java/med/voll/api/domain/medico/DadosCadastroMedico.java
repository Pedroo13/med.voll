package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank
        String nome,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotNull
        Especialidade especialidade,

        @NotNull
        @Valid
        DadosEndereco endereco,

        @NotBlank
        String telefone,

        @NotBlank
        @Email
        String email) {

        // Construtor não canônico que define valores padrão para telefone e email
        public DadosCadastroMedico(String nome, String crm, String string, String s, Especialidade especialidade, DadosEndereco endereco) {
                this(nome, crm, especialidade, endereco, "default-telefone", "default-email@example.com");
        }
}
