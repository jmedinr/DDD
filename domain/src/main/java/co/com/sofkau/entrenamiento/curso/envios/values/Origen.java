package co.com.sofkau.entrenamiento.curso.envios.values;

import co.com.sofka.domain.generic.ValueObject;

public class Origen implements ValueObject<String> {
    private final String origen;


    public Origen(String origen) {
        this.origen = origen;
    }

    @Override
    public String value() {
        return origen;
    }
}
