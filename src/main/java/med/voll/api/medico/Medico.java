package med.voll.api.medico;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.endereco.Endereco;
import org.springframework.web.bind.annotation.DeleteMapping;

@Table(name = "medico")
@Entity(name = "medico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medico_id_seq")
    @SequenceGenerator(name = "medico_id_seq", sequenceName = "medico_id_seq", allocationSize = 1)
    private Long id;
    private String nome;
    private String email;
    private String crm;
    private String telefone;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
        this.telefone = dados.telefone();
    }


}
