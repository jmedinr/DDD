package co.com.sofkau.entrenamiento.curso.entities.envios.values;

import co.com.sofka.domain.generic.ValueObject;

public class Destino implements ValueObject<String> {
    private final String destino;

    public Destino(String destino) {
        this.destino = destino;
    }

    @Override
    public String value() {
        return null;
    }
}
