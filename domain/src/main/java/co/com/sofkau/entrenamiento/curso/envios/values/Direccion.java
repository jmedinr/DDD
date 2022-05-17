package co.com.sofkau.entrenamiento.curso.envios.values;

import co.com.sofka.domain.generic.ValueObject;

public class Direccion implements ValueObject<String> {
    private final String value;

    public Direccion(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return null;
    }
}
