package co.com.sofkau.entrenamiento.curso.entities.clientes.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
/**
 * Email es un  objeto de valor del  agregado de clientes
 * se hacen  validaciones de campos requeridos y maxLength
 *
 * @Version 1.0
 * @Author Jhon Stiven Granada Acevedo
 * @Email ticen17.jsga@gmail.com
 * *
 */

public class Email implements ValueObject<String> {
    private final String value;

    public  Email(String value){
        this.value = Objects.requireNonNull(value,"EMAIL REQUERIDO");
    }
    @Override
    public String value() {
        return value;
    }
}
