package co.com.sofkau.entrenamiento.curso.envios.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {
    private final String value;

    public Nombre(String value) {

        this.value = Objects.requireNonNull(value, "El nombre no puede ser null");
    }

    @Override
    public String value() {
        return value;
    }
}
