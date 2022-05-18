package co.com.sofkau.entrenamiento.curso.clientes.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Email implements ValueObject<String> {
    private final String value;

    public Email(String value) {
        this.value = Objects.requireNonNull(value, "EMAIL REQUERIDO");

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
