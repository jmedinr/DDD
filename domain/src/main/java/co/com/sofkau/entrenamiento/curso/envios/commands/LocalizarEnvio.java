package co.com.sofkau.entrenamiento.curso.envios.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.envios.values.Ubicacion;

public class LocalizarEnvio extends Command {
    private final EnviosId enviosId;
    private final Ubicacion ubicacion;

    public LocalizarEnvio(EnviosId enviosId, Ubicacion ubicacion) {
        this.enviosId = enviosId;
        this.ubicacion = ubicacion;
    }

    public EnviosId getEnviosId() {
        return enviosId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
