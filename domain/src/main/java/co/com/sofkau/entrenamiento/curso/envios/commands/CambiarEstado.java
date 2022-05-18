package co.com.sofkau.entrenamiento.curso.envios.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.envios.values.Estado;

public class CambiarEstado extends Command {
    private final EnviosId enviosId;
    private final Estado estado;

    public CambiarEstado(EnviosId enviosId, Estado estado) {
        this.enviosId = enviosId;
        this.estado = estado;
    }

    public EnviosId getEnviosId() {
        return enviosId;
    }

    public Estado getEstado() {
        return estado;
    }
}
