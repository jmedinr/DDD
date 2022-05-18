package co.com.sofkau.entrenamiento.curso.envios.identities;

import co.com.sofka.domain.generic.Identity;

public class EnviosId extends Identity {
    private EnviosId(String id) {
        super(id);
    }

    public static EnviosId of(String id) {
        return new EnviosId(id);
    }
}
