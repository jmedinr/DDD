package co.com.sofkau.entrenamiento.curso.envios.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.envios.values.Estado;
/**
 * Representa el comando de cambio de estado del envio.
 *
 * @version 1.0.0 2022-05-18.
 *
 * @author Juan Diego Medina <juandiego619@gmail.com>, Luis Felipe Rivas <luisfelorivas@gmai.com>
 *
 * @since 1.0.0 2022-05-18.
 */
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
