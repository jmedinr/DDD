package co.com.sofkau.entrenamiento.curso.paquete.values;

import co.com.sofka.domain.generic.ValueObject;

public class Entrega  implements ValueObject<String> {
    private final String value;

    public Entrega(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
