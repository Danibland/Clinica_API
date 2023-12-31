package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.paciente.DatosRegistroPaciente;
import med.voll.api.paciente.Paciente;
import med.voll.api.paciente.PacienteRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pacientes")
public class PacientesController {

    private PacienteRepository pacienteRepository;
    @PostMapping
    public void registrarPaciente(@RequestBody @Valid DatosRegistroPaciente datosRegistroPaciente){

        System.out.println("El requiest llega correctamente desde paciente");
        pacienteRepository.save(new Paciente(datosRegistroPaciente));

    }

}
