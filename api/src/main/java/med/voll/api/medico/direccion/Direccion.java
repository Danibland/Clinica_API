package med.voll.api.medico.direccion;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.medico.Medico;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {


    private String calle;
    private String ciudad;
    private  String numero;
    private String complemento ;

    public Direccion(DatosDireccion direccion) {
        this.calle = direccion.calle();
        this.ciudad= direccion.ciudad();
        this.numero = direccion.numero();
        this.complemento = direccion.complemento();

    }
}
