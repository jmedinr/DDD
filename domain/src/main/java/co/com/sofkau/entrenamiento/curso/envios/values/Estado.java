package co.com.sofkau.entrenamiento.curso.envios.values;

import co.com.sofka.domain.generic.ValueObject;

public class Estado implements ValueObject<Estado.Estados> {
    private final Estados value;

    public Estado(Estados value) {
        this.value = value;
    }

    @Override
    public Estados value() {
        return value;
    }


    public enum Estados{
        DESPACHADO, ENPROCESO, ENTREGADO, POR_INICIAR
    }
}
