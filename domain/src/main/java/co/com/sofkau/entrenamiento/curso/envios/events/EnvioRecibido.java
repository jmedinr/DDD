package co.com.sofkau.entrenamiento.curso.envios.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envios.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.envios.values.Nombre;
import co.com.sofkau.entrenamiento.curso.paquete.identities.PaqueteID;
import co.com.sofkau.entrenamiento.curso.paquete.values.Entrega;

public class EnvioRecibido extends DomainEvent {
    private final PaqueteID paqueteID;
    private final Nombre nombre;
    private final Descripcion descripcion;
    private final Entrega entrega;
    public EnvioRecibido(PaqueteID paqueteID, Nombre nombrePaquete, Descripcion descripcionPaquete, Entrega entrega) {
        super("co.com.sofkau.entrenamiento.curso.entities.EnvioRecibido");
        this.nombre=nombrePaquete;
        this.descripcion=descripcionPaquete;
        this.paqueteID=paqueteID;
        this.entrega=entrega;
    }

    public PaqueteID getIdPaquete() {
        return paqueteID;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Entrega getEntrega() {
        return entrega;
    }
}
