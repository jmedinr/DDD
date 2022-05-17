package co.com.sofkau.entrenamiento.curso.entities.envios;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.entrenamiento.curso.entities.envios.events.facturaGenerada;

import java.util.HashMap;

public class EnviosChange extends EventChange {
    public EnviosChange(Envios envios){

        apply((facturaGenerada event) -> {
            envios.  juegoInicializado = Boolean.FALSE;
            juego.jugadores = new HashMap<>();
        });
    }
}
