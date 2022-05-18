package co.com.sofkau.entrenamiento.curso.entities.envios;

import co.com.sofka.domain.generic.EventChange;

import co.com.sofkau.entrenamiento.curso.entities.envios.events.facturaGenerada;
import co.com.sofkau.entrenamiento.curso.entities.envios.events.CambioEstado;
import co.com.sofkau.entrenamiento.curso.entities.envios.events.EnvioLocalizado;
import co.com.sofkau.entrenamiento.curso.entities.envios.events.EnvioRecibido;
import co.com.sofkau.entrenamiento.curso.entities.envios.events.RutaAgregada;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Estado;

import java.util.HashMap;

public class EnviosChange extends EventChange {
    public EnviosChange(Envios envios){

        apply((facturaGeneradaEvents event) -> {

        });

        apply((EnvioLocalizado event)->{
            var ubicacion=event.getUbicacion();
            envios.ruta.agregarUbicacion(ubicacion);

        });

        apply((EnvioRecibido event)->{
            envios.estado=new Estado(Estado.Estados.ENPROCESO);
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
