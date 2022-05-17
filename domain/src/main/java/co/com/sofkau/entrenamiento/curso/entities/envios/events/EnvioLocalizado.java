package co.com.sofkau.entrenamiento.curso.entities.envios.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.entities.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Ubicacion;

public class EnvioLocalizado extends DomainEvent {
    private final Ubicacion ubicacion;
    private final EnviosId enviosId;
    public EnvioLocalizado(Ubicacion ubicacion, EnviosId enviosId) {
        super("co.com.sofkau.entrenamiento.curso.entities.EnvioLocalizado");
        this.ubicacion = ubicacion;
        this.enviosId = enviosId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public EnviosId getEnviosId() {
        return enviosId;
    }
}
