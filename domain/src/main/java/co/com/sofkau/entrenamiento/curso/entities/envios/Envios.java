package co.com.sofkau.entrenamiento.curso.entities.envios;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.entrenamiento.curso.entities.envios.entities.Factura;
import co.com.sofkau.entrenamiento.curso.entities.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Estado;
import co.com.sofkau.entrenamiento.curso.entities.envios.entities.Ruta;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Fecha;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Nombre;

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
