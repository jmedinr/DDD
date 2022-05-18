package co.com.sofkau.entrenamiento.curso.envios.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.envios.values.Ubicacion;
/**
 * Representa el comando que le asigna una ubicacion a un envio..
 *
 * @version 1.0.0 2022-05-18.
 *
 * @author Juan Diego Medina <juandiego619@gmail.com>, Luis Felipe Rivas <luisfelorivas@gmai.com>
 *
 * @since 1.0.0 2022-05-18.
 */
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
