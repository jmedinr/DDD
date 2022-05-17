package co.com.sofkau.entrenamiento.curso.entities.envios.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ValorTotal implements ValueObject<Integer> {
    private final Integer valor;

    public ValorTotal(Integer valor) {
        //TODO: Validaciones
        this.valor = valor;
    }

    @Override
    public Integer value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ValorTotal)) return false;
        ValorTotal that = (ValorTotal) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
