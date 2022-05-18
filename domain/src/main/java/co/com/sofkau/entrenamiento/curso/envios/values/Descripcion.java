package co.com.sofkau.entrenamiento.curso.envios.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<String> {
    private final String value;

    public Descripcion(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La descripcion no puede estar en blanco");
        }

        if (this.value.length() > 500) {
            throw new IllegalArgumentException("La descripcion no permite mas de 500 caracteres");
        }
    }


    @Override
    public String value() {
        return value;
    }
}
