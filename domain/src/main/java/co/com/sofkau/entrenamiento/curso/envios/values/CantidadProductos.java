package co.com.sofkau.entrenamiento.curso.envios.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantidadProductos implements ValueObject<Integer> {
    private final Integer cantidad;

    public CantidadProductos(Integer cantidad) {
        this.cantidad = Objects.requireNonNull(cantidad, "CANTIDAD PRODUCTOS");

    }

    @Override
    public Integer value() {
        return cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CantidadProductos)) return false;
        CantidadProductos that = (CantidadProductos) o;
        return Objects.equals(cantidad, that.cantidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cantidad);
    }
}
