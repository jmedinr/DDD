package co.com.sofkau.entrenamiento.curso.paquete.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * TipoEntrega es un objeto de valor del  agregado de paquete
 * se hacen  validaciones de campos requeridos y maxLength
 *
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */

public class TipoEntrega implements ValueObject<String> {
    private final String value;
    private final String Dinero;
    private final String Mercancia;
    private final String Documento;

    public TipoEntrega(String value, String dinero, String mercancia, String documento) {
        this.value = Objects.requireNonNull(value, "TipoEntrega Requerido");
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("El TipoEntrega no puede estar en blanco");
        }

        if (this.value.length() > 200) {
            throw new IllegalArgumentException("El TipoEntrega no permite mas de 200 caracteres");
        }
        Dinero = dinero;
        Mercancia = mercancia;
        Documento = documento;
    }

    @Override
    public String value() {
        return value;
    }
}