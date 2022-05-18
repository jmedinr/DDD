package co.com.sofkau.entrenamiento.curso.envios.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envios.values.Destino;
import co.com.sofkau.entrenamiento.curso.envios.values.Origen;

public class AgregarRuta extends Command {
    private final Origen origen;
    private final Destino destino;


    public AgregarRuta(Origen origen, Destino destino) {
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
