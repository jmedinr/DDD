package co.com.sofkau.entrenamiento.curso.envios.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.envios.values.Destino;
import co.com.sofkau.entrenamiento.curso.envios.values.Origen;

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
