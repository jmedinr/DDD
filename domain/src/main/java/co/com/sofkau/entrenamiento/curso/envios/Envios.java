package co.com.sofkau.entrenamiento.curso.envios;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.clientes.Clientes;
import co.com.sofkau.entrenamiento.curso.clientes.identities.ClienteId;
import co.com.sofkau.entrenamiento.curso.envios.entities.Factura;
import co.com.sofkau.entrenamiento.curso.envios.events.*;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.envios.entities.Ruta;
import co.com.sofkau.entrenamiento.curso.envios.identities.FacturaId;
import co.com.sofkau.entrenamiento.curso.envios.values.*;
import co.com.sofkau.entrenamiento.curso.paquete.identities.PaqueteID;

import java.util.List;
import java.util.Set;

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

    public static Envios from(EnviosId entityId, List<DomainEvent> events) {
        var Envio = new Envios(entityId);
        events.forEach(Envio::applyEvent);
        return Envio;
    }

    public Envios(EnviosId entityId, PaqueteID idPaquete, ClienteId idCLiente, Nombre nombreEnvio, Descripcion descripcion,
                  Fecha fecha, Estado estado, Ruta ruta, Factura factura) {
        super(entityId);
        appendChange(new Enviado(entityId, idPaquete, idCLiente, nombreEnvio, descripcion)).apply();
        subscribe(new EnviosChange(this));

    }

    public void generarFactura(FacturaId entityId, Nombre nombre, Fecha fecha,
                               ValorTotal valorTotal, CantidadProductos cantidadProductos, Set<DatosEmpresa> datosEmpresa) {
        appendChange(new FacturaGenerada(entityId, nombre, fecha, valorTotal, cantidadProductos, datosEmpresa)).apply();
    }

    public void localizarEnvio(Ubicacion ubicacion) {
        appendChange(new EnvioLocalizado(ubicacion)).apply();
    }

    public void agregarRuta(Origen origen, Destino destino) {
        appendChange(new RutaAgregada(origen, destino)).apply();
    }

    public void cambiarEstado(Estado estado) {
        appendChange(new CambioEstado(estado)).apply();

    }

    public void enviar(EnviosId enviosId, Nombre nombre, Descripcion descripcion) {
        appendChange(new Enviado(enviosId, idPaquete, idCLiente, nombre, descripcion)).apply();
    }

    public Nombre getNombreEnvio() {
        return nombreEnvio;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public Factura getFactura() {
        return factura;
    }

    public PaqueteID getIdPaquete() {
        return idPaquete;
    }

    public ClienteId getIdCLiente() {
        return idCLiente;
    }
}
