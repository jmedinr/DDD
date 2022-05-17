package co.com.sofkau.entrenamiento.curso.entities.envios.values;

import co.com.sofka.domain.generic.ValueObject;

public class Documento implements ValueObject<String> {
    private final String value;

    public Documento(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
