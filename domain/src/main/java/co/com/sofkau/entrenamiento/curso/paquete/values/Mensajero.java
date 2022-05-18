package co.com.sofkau.entrenamiento.curso.paquete.values;

import co.com.sofka.domain.generic.ValueObject;

public class Mensajero  implements ValueObject<String> {
    private final String value;

    public Mensajero(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}