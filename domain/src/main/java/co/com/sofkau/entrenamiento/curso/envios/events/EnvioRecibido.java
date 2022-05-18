package co.com.sofkau.entrenamiento.curso.envios.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envios.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.envios.values.Nombre;

public class EnvioRecibido extends DomainEvent {
    private final IdPaquete idPaquete;
    private final Nombre nombre;
    private final Descripcion descripcion;
    private final Entrega entrega;
    public EnvioRecibido(IdPaquete idPaquete, Nombre nombrePaquete, Descripcion descripcionPaquete, Entrega entrega) {
        super("co.com.sofkau.entrenamiento.curso.entities.EnvioRecibido");
        this.nombre=nombrePaquete;
        this.descripcion=descripcionPaquete;
        this.idPaquete=idPaquete;
        this.entrega=entrega;
    }

    public IdPaquete getIdPaquete() {
        return idPaquete;
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
