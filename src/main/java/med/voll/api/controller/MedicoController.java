package med.voll.api.controller;

import med.voll.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados) { //padrão DTO - Data Transfer Object("Objeto de transferência de dados"). Padrão usado em APIS para representar os dados que chegam na API e tbm os dados que devolvemos dela.
        System.out.println(dados);
    }
}
