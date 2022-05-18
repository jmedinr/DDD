package co.com.sofkau.entrenamiento.curso.paquete;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.paquete.events.PaqueteCreado;
import co.com.sofkau.entrenamiento.curso.paquete.identities.PaqueteID;
import co.com.sofkau.entrenamiento.curso.paquete.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.paquete.values.Entrega;
import co.com.sofkau.entrenamiento.curso.paquete.values.Mensajero;
import co.com.sofkau.entrenamiento.curso.paquete.values.Nombre;

import java.util.List;

/**
 * Agregado  paquete
 * Se hacen metodos get y set de todos sus atributos y metodo crear paquete
 *
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */
public class Paquete extends AggregateEvent<PaqueteID> {
    protected EnviosId enviosId;
    protected Mensajero mensajero;
    protected Entrega entrega;

    protected Nombre nombre;
    protected Descripcion descripcion;

    public Paquete(PaqueteID entityId, EnviosId enviosId, Mensajero mensajero,
                   Entrega entrega, Nombre nombre, Descripcion descripcion) {
        super(entityId);

        appendChange(new PaqueteCreado(mensajero, entrega, enviosId, nombre, descripcion)).apply();
        subscribe(new PaqueteEventChange(this));
    }


    public static Paquete from(PaqueteID entityId, List<DomainEvent> events) {
        var paquet = new Paquete(entityId);
        events.forEach(paquet::applyEvent);
        return paquet;
    }


    public EnviosId getEnviosId() {
        return enviosId;
    }

    public Mensajero getMensajero() {
        return mensajero;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Paquete(PaqueteID entityId) {
        super(entityId);
    }


    public void crearPaquete(Mensajero mensajero, Entrega entrega, EnviosId enviosId, Nombre nombre, Descripcion descripcion) {
        appendChange(new PaqueteCreado(mensajero, entrega, enviosId, nombre, descripcion)).apply();

    }
}
