package co.com.sofkau.entrenamiento.curso.entities;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.entrenamiento.curso.entities.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.entities.values.Documento;
import co.com.sofkau.entrenamiento.curso.entities.values.Fecha;
import co.com.sofkau.entrenamiento.curso.entities.values.Nombre;

public class Envios extends AggregateEvent<EnviosId> {

    protected Nombre nombre;
    protected Descripcion descripcion;
    protected Fecha fecha;
    protected Persona remitente;
    protected Persona destinatario;
    protected Ruta ruta;
    protected Documento documento;
    protected Factura factura;

    public Envios(EnviosId entityId) {
        super(entityId);
    }
}
