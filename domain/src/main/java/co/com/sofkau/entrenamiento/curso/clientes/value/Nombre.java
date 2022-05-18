package co.com.sofkau.entrenamiento.curso.clientes.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {
    private final String value;

    public Nombre(String value) {

        this.value = Objects.requireNonNull(value,"NOMBRE REQUERIDO");
    }


    @Override

    public String value() {
        return value;
    }
}
