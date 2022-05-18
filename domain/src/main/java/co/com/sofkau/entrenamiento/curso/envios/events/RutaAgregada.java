package co.com.sofkau.entrenamiento.curso.envios.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envios.values.Destino;
import co.com.sofkau.entrenamiento.curso.envios.values.Origen;
/**
 * Representa el evento cuando se agrega una ruta (el origen y destino) al envio.
 *
 * @version 1.0.0 2022-05-18.
 *
 * @author Juan Diego Medina <juandiego619@gmail.com>, Luis Felipe Rivas <luisfelorivas@gmai.com>
 *
 * @since 1.0.0 2022-05-18.
 */
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
