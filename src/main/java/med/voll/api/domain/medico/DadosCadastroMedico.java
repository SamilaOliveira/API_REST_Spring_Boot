package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(

        @NotBlank(message = "{nome.obrigatorio}") //informa que o nome não pode ser nulo (somente para nulo, pode se usar o NotNull) e nem vazio.
        String nome,
        @NotBlank(message = "{email.obrigatorio}")
        @Email(message = "{email.invalido}")
        String email,


        @NotBlank(message = "{telefone.obrigatorio}")
        @Pattern(regexp = "\\d{10,11}", message = "{telefone.invalido}")
        String telefone,
        @NotBlank(message = "{crm.obrigatorio}")
        @Pattern(regexp = "\\d{4,6}", message = "{crm.invalido}")
        String crm,
        @NotNull(message = "{especialidade.obrigatoria}")
        Especialidade especialidade,
        @NotNull(message = "{endereco.obrigatorio}")
        @Valid
        DadosEndereco endereco
    ) {
}
