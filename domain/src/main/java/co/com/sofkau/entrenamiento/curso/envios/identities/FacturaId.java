package co.com.sofkau.entrenamiento.curso.envios.identities;

import co.com.sofka.domain.generic.Identity;

public class FacturaId extends Identity {
    private FacturaId(String id) {
        super(id);
    }

    public static FacturaId of(String id) {
        return new FacturaId(id);
    }
}
