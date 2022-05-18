package co.com.sofkau.entrenamiento.curso.envios.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envios.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.envios.values.Nombre;

public class EnvioRecibido extends DomainEvent {

    public EnvioRecibido() {
        super("co.com.sofkau.entrenamiento.curso.entities.EnvioRecibido");
    }
}
