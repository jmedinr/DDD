package co.com.sofkau.entrenamiento.curso.envios.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envios.values.Destino;
import co.com.sofkau.entrenamiento.curso.envios.values.Origen;

public class RutaAgregada extends DomainEvent {
    private final Origen origen;
    private final Destino destino;
    public RutaAgregada(Origen origen, Destino destino) {
        super("co.com.sofkau.entrenamiento.curso.RutaAgregada");
        this.origen=origen;
        this.destino=destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public Destino getDestino() {
        return destino;
    }
}
