package co.com.sofkau.entrenamiento.curso.envios.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.envios.values.Destino;
import co.com.sofkau.entrenamiento.curso.envios.values.Origen;

/**
 * Representa el comando de agregar ruta al envio.
 *
 * @version 1.0.0 2022-05-18.
 *
 * @author Juan Diego Medina <juandiego619@gmail.com>, Luis Felipe Rivas <luisfelorivas@gmai.com>
 *
 * @since 1.0.0 2022-05-18.
 */
public class AgregarRuta extends Command {
    private final EnviosId enviosId;
    private final Origen origen;
    private final Destino destino;


    public AgregarRuta(EnviosId enviosId, Origen origen, Destino destino) {
        this.enviosId = enviosId;
        this.origen = origen;
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public Destino getDestino() {
        return destino;
    }
}
