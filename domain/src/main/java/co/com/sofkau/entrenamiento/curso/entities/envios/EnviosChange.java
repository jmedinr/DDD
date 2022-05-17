package co.com.sofkau.entrenamiento.curso.entities.envios;

import co.com.sofka.domain.generic.EventChange;

import java.util.HashMap;

public class EnviosChange extends EventChange {
    public EnviosChange(Envios envios){

        apply((facturaGeneradaEvents event) -> {

        });
    }
}
