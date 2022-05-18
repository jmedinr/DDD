package co.com.sofkau.entrenamiento.curso.envios;

import co.com.sofka.domain.generic.EventChange;

import co.com.sofkau.entrenamiento.curso.envios.entities.Factura;
import co.com.sofkau.entrenamiento.curso.envios.events.*;
import co.com.sofkau.entrenamiento.curso.envios.values.Estado;

public class EnviosChange extends EventChange {
    public EnviosChange(Envios envios){

        apply((FacturaGenerada event) -> {
            var facturaId=event.getFacturaId();
            var factura=new Factura(facturaId,event.getNombre(),
                    event.getFecha(),event.getValorTotal(),event.getCantidadProductos(),event.getDatosEmpresa());
            envios.factura=factura;


        });

        apply((EnvioLocalizado event)->{
            var ubicacion=event.getUbicacion();
            envios.ruta.agregarUbicacion(ubicacion);

        });

        apply((EnvioRecibido event)->{
            envios.estado=new Estado(Estado.Estados.ENTREGADO);
        });

        apply((RutaAgregada event)->{
            envios.ruta.agregarRuta(event.getOrigen(),event.getDestino());
        });

        apply((CambioEstado event)->{
            var estado=event.getEstado();
            envios.estado=estado;
        });
    }
}
