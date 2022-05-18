package co.com.sofkau.entrenamiento.curso.envios;

import co.com.sofka.domain.generic.EventChange;

import co.com.sofkau.entrenamiento.curso.envios.events.CambioEstado;
import co.com.sofkau.entrenamiento.curso.envios.events.EnvioLocalizado;
import co.com.sofkau.entrenamiento.curso.envios.events.EnvioRecibido;
import co.com.sofkau.entrenamiento.curso.envios.events.RutaAgregada;
import co.com.sofkau.entrenamiento.curso.envios.values.Estado;

public class EnviosChange extends EventChange {
    public EnviosChange(Envios envios){

        apply((facturaGeneradaEvents event) -> {

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
