package co.com.sofkau.entrenamiento.curso.clientes.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<String> {
    private final String value;

    public Telefono(String value) {
        this.value = Objects.requireNonNull(value, "NUMERO DE TELEFONO REQUERIDO");
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("El telefono no puede estar en blanco");
        }

        if (this.value.length() > 11) {
            throw new IllegalArgumentException("El telefono no permite mas de 11 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
