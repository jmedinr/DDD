package co.com.sofkau.entrenamiento.curso.envios.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.envios.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.envios.values.Nombre;

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
