package co.com.sofkau.entrenamiento.curso.paquete.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;


/**
 * Entrega es un  objeto de valor del  agregado de paquete
 * se hacen  validaciones de campos requeridos y maxLength
 *
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */


public class Entrega implements ValueObject<String> {
    private final String value;

    public Entrega(String value) {

        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La entrega no puede estar en blanco");
        }

        if (this.value.length() > 200) {
            throw new IllegalArgumentException("La entrega no permite mas de 200 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
