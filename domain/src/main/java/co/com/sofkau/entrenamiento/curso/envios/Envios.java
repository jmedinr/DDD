package co.com.sofkau.entrenamiento.curso.envios;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.entrenamiento.curso.envios.entities.Factura;
import co.com.sofkau.entrenamiento.curso.envios.events.*;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.*;
import co.com.sofkau.entrenamiento.curso.envios.entities.Ruta;
import co.com.sofkau.entrenamiento.curso.envios.identities.FacturaId;
import co.com.sofkau.entrenamiento.curso.envios.values.*;

import java.util.Set;

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
        subscribe(new EnviosChange(this));
        
    }
    public void generarFactura(FacturaId entityId, Nombre nombre, Fecha fecha,
                               ValorTotal valorTotal, CantidadProductos cantidadProductos, Set<DatosEmpresa> datosEmpresa){
        appendChange(new FacturaGenerada(entityId,nombre,fecha, valorTotal, cantidadProductos,datosEmpresa)).apply();
    }

    public void entregarEnvio(){

        appendChange(new EnvioRecibido( )).apply();

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
