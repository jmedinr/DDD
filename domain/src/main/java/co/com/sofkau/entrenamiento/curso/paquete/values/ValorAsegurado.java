package co.com.sofkau.entrenamiento.curso.paquete.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * PaqueteAsegurado es un  objeto de valor del  agregado de paquete
 * se hacen  validaciones de campos requeridos
 *
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */

public class ValorAsegurado implements ValueObject<Double> {


    private final Double value;

    public ValorAsegurado(Double value) {
        this.value = Objects.requireNonNull(value, "ValorAsegurado Requerido");

    }

    @Override
    public Double value() {
        return null;
    }
}
