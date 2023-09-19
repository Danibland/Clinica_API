package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.medico.direccion.DatosDireccion;
import org.hibernate.validator.constraints.UniqueElements;

public record DatosRegistroMedico(
        @NotBlank
        String nombre,
        @NotBlank
        @UniqueElements
        @Email
        String email,
        @NotBlank
                @Pattern(regexp = "\\d{4,6}")
        String documento ,

        @NotBlank
        Especialidad especialidad,
        @NotNull
                @Valid
        DatosDireccion direccion ) {



}
