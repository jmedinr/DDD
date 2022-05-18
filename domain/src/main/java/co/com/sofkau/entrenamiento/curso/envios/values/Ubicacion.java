package co.com.sofkau.entrenamiento.curso.envios.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ubicacion implements ValueObject<String> {
    private final String actual;


    public Ubicacion(String actual) {
        this.actual = Objects.requireNonNull(actual);

    }


    @Override
    public String value() {
        return actual;
    }
}
