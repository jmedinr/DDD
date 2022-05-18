package co.com.sofkau.entrenamiento.curso.clientes.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<String> {
   private final String value;

   public Telefono(String value){
       this.value = Objects.requireNonNull(value,"NUMERO DE TELEFONO REQUERIDO");
   }
    @Override
    public String value() {
        return value;
    }
}
