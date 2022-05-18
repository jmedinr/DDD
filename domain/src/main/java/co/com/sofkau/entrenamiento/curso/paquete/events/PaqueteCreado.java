package co.com.sofkau.entrenamiento.curso.paquete.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.paquete.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.paquete.values.Entrega;
import co.com.sofkau.entrenamiento.curso.paquete.values.Mensajero;
import co.com.sofkau.entrenamiento.curso.paquete.values.Nombre;
/**
 * Evento PaqueteCreado
 * Se hacen metodos get y set de todos sus atributos y metodo crear paquete
 *
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */
public class PaqueteCreado extends DomainEvent {

    private final Mensajero mensajero;
    private final Entrega entrega;
    private final EnviosId enviosId;
    private final Nombre nombre;
    private final Descripcion descripcion;

    public PaqueteCreado(Mensajero mensajero, Entrega entrega, EnviosId enviosId, Nombre nombre, Descripcion descripcion) {
        super("co.com.sofkau.entrenamiento.PaqueteCreado");
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

