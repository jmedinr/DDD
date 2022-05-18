package co.com.sofkau.entrenamiento.curso.paquete.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * Telefono es un  objeto de valor del  agregado de paquete
 * se hacen  validaciones de campos requeridos y maxLength
 *
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */
public class Telefono implements ValueObject<String> {
    private final String value;

    public Telefono(String value) {
        this.value = Objects.requireNonNull(value, "Telefono obligatorio");
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("El telefono no puede estar en blanco");
        }

        if (this.value.length() > 11) {
            throw new IllegalArgumentException("El telefono no permite mas de 11 caracteres");
        }
    }


    @Override
    public String value() {
        return value;
    }
}
