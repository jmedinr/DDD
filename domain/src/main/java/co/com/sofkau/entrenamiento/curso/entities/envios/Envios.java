package co.com.sofkau.entrenamiento.curso.entities.envios;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.entrenamiento.curso.entities.envios.entities.Factura;
import co.com.sofkau.entrenamiento.curso.entities.envios.events.EnvioLocalizado;
import co.com.sofkau.entrenamiento.curso.entities.envios.events.EnvioRecibido;
import co.com.sofkau.entrenamiento.curso.entities.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.*;
import co.com.sofkau.entrenamiento.curso.entities.envios.entities.Ruta;

public class Envios extends AggregateEvent<EnviosId> {
    protected EnviosId enviosId;
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


    public void recibirEnvio(Nombre nombrePaquete,Descripcion descripcionPaquete, Entrega entrega ){
        IdPaquete idPaquete=new IdPaquete();

        appendChange(new EnvioRecibido(idPaquete, nombrePaquete,descripcionPaquete,entrega )).apply();

    }

    public void localizarEnvio(Ubicacion ubicacion){
        appendChange(new EnvioLocalizado(ubicacion, enviosId)).apply();


    }
}
