package co.com.sofkau.entrenamiento.curso.entities.envios.values;

import co.com.sofka.domain.generic.ValueObject;

public class Telefono implements ValueObject<String> {
    private final String value;

    public Telefono(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
