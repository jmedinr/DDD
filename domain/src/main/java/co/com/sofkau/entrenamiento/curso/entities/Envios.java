package co.com.sofkau.entrenamiento.curso.entities;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.entrenamiento.curso.entities.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.entities.values.Documento;
import co.com.sofkau.entrenamiento.curso.entities.values.Fecha;
import co.com.sofkau.entrenamiento.curso.entities.values.Nombre;

public class Envios extends AggregateEvent<EnviosId> {

    protected Nombre nombreEnvio;
    protected Descripcion descripcion;
    protected Fecha fecha;
    protected Estado estado;
    protected Ruta ruta;
    protected Factura factura;
    protected IdPaquete idPaquete;
    protected IdCLiente idCLiente;

    public Envios(EnviosId entityId) {
        super(entityId);
    }
}
