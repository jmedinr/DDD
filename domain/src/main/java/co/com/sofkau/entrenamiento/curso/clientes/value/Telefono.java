package co.com.sofkau.entrenamiento.curso.clientes.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
/**
 * Telefono es un  objeto de valor del  agregado de clientes
 * se hacen  validaciones de campos requeridos y maxLength
 *
 * @Version 1.0
 * @Author Jhon Stiven Granada Acevedo
 * @Email ticen17.jsga@gmail.com
 * *
 */
public class Telefono implements ValueObject<String> {
    private final String value;

    public Telefono(String value) {
        this.value = Objects.requireNonNull(value, "NUMERO DE TELEFONO REQUERIDO");
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
