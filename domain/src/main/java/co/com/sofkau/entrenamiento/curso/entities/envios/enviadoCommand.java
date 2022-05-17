package co.com.sofkau.entrenamiento.curso.entities.envios;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.entities.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Nombre;

public class enviadoCommand extends Command {
    private final EnviosId enviosId;
    private final Nombre nombre;
    private final Descripcion descripcion;


    public enviadoCommand(EnviosId enviosId, Nombre nombre, Descripcion descripcion) {
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
