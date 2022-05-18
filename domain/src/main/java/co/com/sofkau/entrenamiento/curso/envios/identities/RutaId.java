package co.com.sofkau.entrenamiento.curso.envios.identities;

import co.com.sofka.domain.generic.Identity;

public class RutaId extends Identity {
    private RutaId(String id) {
        super(id);
    }

    public static RutaId of(String id) {
        return new RutaId(id);
    }
}
