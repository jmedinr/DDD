package co.com.sofkau.entrenamiento.curso.envios.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Correo implements ValueObject<String> {
    private final String value;

    public Correo(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("El correo no puede estar en blanco");
        }

        if (this.value.length() > 324) {
            throw new IllegalArgumentException("El correo no permite mas de 324 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
