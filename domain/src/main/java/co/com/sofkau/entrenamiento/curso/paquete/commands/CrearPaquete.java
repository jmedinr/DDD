package co.com.sofkau.entrenamiento.curso.paquete.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.paquete.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.paquete.values.Entrega;
import co.com.sofkau.entrenamiento.curso.paquete.values.Mensajero;
import co.com.sofkau.entrenamiento.curso.paquete.values.Nombre;

public class CrearPaquete extends Command {


    private final Mensajero mensajero;
    private final Entrega entrega;
    private final EnviosId enviosId;
    private final Nombre nombre;
    private final Descripcion descripcion;


    public CrearPaquete(Mensajero mensajero, Entrega entrega, EnviosId enviosId, Nombre nombre, Descripcion descripcion) {
        this.mensajero = mensajero;
        this.entrega = entrega;
        this.enviosId = enviosId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Mensajero getMensajero() {
        return mensajero;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public EnviosId getEnviosId() {
        return enviosId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}



