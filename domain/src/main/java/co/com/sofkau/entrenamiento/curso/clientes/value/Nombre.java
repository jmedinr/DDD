package co.com.sofkau.entrenamiento.curso.clientes.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
/**
 * Nombre es un  objeto de valor del  agregado de clientes
 * se hacen  validaciones de campos requeridos y maxLength
 *
 * @Version 1.0
 * @Author Jhon Stiven Granada Acevedo
 * @Email ticen17.jsga@gmail.com
 * *
 */
public class Nombre implements ValueObject<String> {
    private final String value;

    public Nombre(String value) {

        this.value = Objects.requireNonNull(value, "NOMBRE REQUERIDO");
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar en blanco");
        }

        if (this.value.length() > 200) {
            throw new IllegalArgumentException("El nombre no permite mas de 200 caracteres");
        }
    }


    @Override

    public String value() {
        return value;
    }
}
