package co.com.sofkau.entrenamiento.curso.envios;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.entrenamiento.curso.clientes.identities.ClienteId;
import co.com.sofkau.entrenamiento.curso.envios.entities.Factura;
import co.com.sofkau.entrenamiento.curso.envios.events.Enviado;
import co.com.sofkau.entrenamiento.curso.envios.events.CambioEstado;
import co.com.sofkau.entrenamiento.curso.envios.events.EnvioLocalizado;
import co.com.sofkau.entrenamiento.curso.envios.events.EnvioRecibido;
import co.com.sofkau.entrenamiento.curso.envios.events.RutaAgregada;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.envios.entities.Ruta;
import co.com.sofkau.entrenamiento.curso.envios.values.*;
import co.com.sofkau.entrenamiento.curso.paquete.identities.PaqueteID;
import co.com.sofkau.entrenamiento.curso.paquete.values.Entrega;

public class Envios extends AggregateEvent<EnviosId> {
    protected Nombre nombreEnvio;
    protected Descripcion descripcion;
    protected Fecha fecha;
    protected Estado estado;
    protected Ruta ruta;
    protected Factura factura;
    protected PaqueteID idPaquete;
    protected ClienteId idCLiente;

    public Envios(EnviosId entityId) {
        super(entityId);
    }

    public Envios(EnviosId entityId, Nombre nombreEnvio, Descripcion descripcion,
                  Fecha fecha, Estado estado, Ruta ruta, Factura factura) {
        super(entityId);
        appendChange(new Enviado(entityId, nombreEnvio, descripcion)).apply();
        
    }

    public void recibirEnvio(Nombre nombrePaquete, Descripcion descripcionPaquete, Entrega entrega ){
        PaqueteID idPaquete=new PaqueteID();

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
