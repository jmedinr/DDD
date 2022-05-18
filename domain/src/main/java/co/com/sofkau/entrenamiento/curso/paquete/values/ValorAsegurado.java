package co.com.sofkau.entrenamiento.curso.paquete.values;

import co.com.sofka.domain.generic.ValueObject;

public class ValorAsegurado implements ValueObject<Double> {


private final Double value;

    public ValorAsegurado(Double value) {
        this.value = value;
    }

    @Override
    public Double value() {
        return null;
    }
}
