package co.com.sofkau.entrenamiento.curso.entities.clientes.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
/**
 * Telefono es un  objeto de valor del  agregado de clientes
 * Se hacen  validaciones de campos requeridos y maxLength
 *
 * @Version 1.0
 * @Author Jhon Stiven Granada Acevedo
 * @Email ticen17.jsga@gmail.com
 * *
 */
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
