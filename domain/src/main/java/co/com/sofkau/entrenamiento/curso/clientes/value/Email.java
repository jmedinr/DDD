package co.com.sofkau.entrenamiento.curso.clientes.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

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
