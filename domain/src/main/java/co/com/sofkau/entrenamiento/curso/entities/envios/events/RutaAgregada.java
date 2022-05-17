package co.com.sofkau.entrenamiento.curso.entities.envios.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Destino;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Origen;

public class RutaAgregada extends DomainEvent {
    private Origen origen;
    private Destino destino;
    public RutaAgregada(Origen origen, Destino destino) {
        super("co.com.sofkau.entrenamiento.curso.entities.RutaAgregada");
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