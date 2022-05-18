package co.com.sofkau.entrenamiento.curso.paquete.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;


/**
 * Peso es un  objeto de valor del  agregado de paquete
 * se hacen  validaciones de campos requeridos
 *
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */
public class Peso implements ValueObject<Double> {
    private final Double value;

    public Peso(Double value) {
        this.value = Objects.requireNonNull(value, "Peso Requerido");


    }


    @Override
    public Double value() {
        return value;
    }
}
