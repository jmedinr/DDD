package co.com.sofkau.entrenamiento.curso.envios.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envios.values.Estado;
/**
 * Representa evento del cambio de estado del envio.
 *
 * @version 1.0.0 2022-05-18.
 *
 * @author Juan Diego Medina <juandiego619@gmail.com>, Luis Felipe Rivas <luisfelorivas@gmai.com>
 *
 * @since 1.0.0 2022-05-18.
 */
public class CambioEstado extends DomainEvent {
    private Estado estado;
    public CambioEstado(Estado estado) {
        super("co.com.sofkau.entrenamiento.CambiaEstado");
        this.estado=estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
