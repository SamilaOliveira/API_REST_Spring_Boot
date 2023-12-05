package med.voll.api.paciente;

import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface PacienteRepository extends JpaRepository <Paciente, Long> {

    Page<Paciente> findAllByAtivoTrue(Pageable pagina);
}
