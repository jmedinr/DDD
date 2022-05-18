package co.com.sofkau.entrenamiento.curso.envios.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {
    private final String value;

    public Direccion(String value) {
            this.value = Objects.requireNonNull(value);
            if(this.value.isBlank()){
                throw new IllegalArgumentException("La direccion no puede estar en blanco");
            }

            if(this.value.length() > 200){
                throw new IllegalArgumentException("La direccion no permite mas de 200 caracteres");
            }
        }

    @Override
    public String value() {
        return null;
    }
}
