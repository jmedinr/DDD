package co.com.sofkau.entrenamiento.curso.envios.values;

import co.com.sofka.domain.generic.ValueObject;

public class Descripcion implements ValueObject<String> {
    private final String value;

    public Descripcion(String value) {
        //TODO: Validaciones
        this.value = value;
    }

    @Override
    public String value(){return value;}
}
