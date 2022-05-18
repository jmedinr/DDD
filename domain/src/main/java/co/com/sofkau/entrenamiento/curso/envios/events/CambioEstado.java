package co.com.sofkau.entrenamiento.curso.envios.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envios.values.Estado;

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
