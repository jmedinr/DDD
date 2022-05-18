package co.com.sofkau.entrenamiento.curso.paquete;


import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.paquete.commands.CrearPaquete;
import co.com.sofkau.entrenamiento.curso.paquete.identities.PaqueteID;
import co.com.sofkau.entrenamiento.curso.paquete.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.paquete.values.Entrega;
import co.com.sofkau.entrenamiento.curso.paquete.values.Mensajero;
import co.com.sofkau.entrenamiento.curso.paquete.values.Nombre;

public class Paquete extends AggregateEvent<PaqueteID> {
    protected EnviosId enviosId;
    protected Mensajero mensajero;
    protected Entrega entrega;

    protected Nombre nombre;

    protected Descripcion descripcion;

    public Paquete(PaqueteID entityId, EnviosId enviosId, Mensajero mensajero, Entrega entrega) {
        super(entityId);
        this.mensajero = mensajero;
        this.entrega = entrega;
        appendChange(new CrearPaquete(entityId,enviosId,mensajero,entrega)).apply();
    }

    public Paquete(PaqueteID entityId) {
        super(entityId);
    }

    public Mensajero getMensajero() {
        return mensajero;
    }

    public void setMensajero(Mensajero mensajero) {
        this.mensajero = mensajero;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public void crearPaquete(Nombre nombre, Descripcion descripcion, Mensajero mensajero, Entrega entrega) {

    }
}
