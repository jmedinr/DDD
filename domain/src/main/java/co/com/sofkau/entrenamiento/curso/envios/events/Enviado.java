package co.com.sofkau.entrenamiento.curso.envios.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.envios.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.envios.values.Nombre;

public class Enviado extends DomainEvent {
    private final EnviosId enviosId;
    private final Nombre nombre;
    private final Descripcion descripcion;


    public Enviado(EnviosId enviosId, Nombre nombre, Descripcion descripcion) {
        super("co.com.sofkau.entrenamiento.enviado");
        this.enviosId = enviosId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public EnviosId getEnviosId() {
        return enviosId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
