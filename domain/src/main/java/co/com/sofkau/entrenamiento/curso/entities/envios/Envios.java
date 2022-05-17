package co.com.sofkau.entrenamiento.curso.entities.envios;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.entrenamiento.curso.entities.envios.entities.Factura;
import co.com.sofkau.entrenamiento.curso.entities.envios.events.Enviado;
import co.com.sofkau.entrenamiento.curso.entities.envios.events.CambioEstado;
import co.com.sofkau.entrenamiento.curso.entities.envios.events.EnvioLocalizado;
import co.com.sofkau.entrenamiento.curso.entities.envios.events.EnvioRecibido;
import co.com.sofkau.entrenamiento.curso.entities.envios.events.RutaAgregada;
import co.com.sofkau.entrenamiento.curso.entities.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.*;
import co.com.sofkau.entrenamiento.curso.entities.envios.entities.Ruta;

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

    public Envios(EnviosId entityId, Nombre nombreEnvio, Descripcion descripcion,
                  Fecha fecha, Estado estado, Ruta ruta, Factura factura) {
        super(entityId);
        appendChange(new Enviado(entityId, nombreEnvio, descripcion)).apply();
        
    }

    public void recibirEnvio(Nombre nombrePaquete, Descripcion descripcionPaquete, Entrega entrega ){
        IdPaquete idPaquete=new IdPaquete();

        appendChange(new EnvioRecibido(idPaquete, nombrePaquete,descripcionPaquete,entrega )).apply();

    }

    public void localizarEnvio(Ubicacion ubicacion){
        appendChange(new EnvioLocalizado(ubicacion)).apply();
    }

    public void agregarRuta(Origen origen, Destino destino){
        appendChange(new RutaAgregada(origen,destino)).apply();
    }

    public void cambiarEstado(Estado estado){
        appendChange(new CambioEstado(estado)).apply();

    }


    public void enviar(Factura factura){

    }
}
