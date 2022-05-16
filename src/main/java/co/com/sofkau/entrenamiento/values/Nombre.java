package co.com.sofkau.entrenamiento.values;

import co.com.sofka.domain.generic.ValueObject;

public class Nombre implements ValueObject<String> {
    private final String value;

    public Nombre(String value) {
        //TODO: Validaciones
        this.value = value;
    }

    @Override
    public String value(){return value;}
}
