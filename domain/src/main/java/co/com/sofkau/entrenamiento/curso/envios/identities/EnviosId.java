package co.com.sofkau.entrenamiento.curso.envios.identities;

import co.com.sofka.domain.generic.Identity;
/**
 * Representa la identidad de los envios.
 *
 * @version 1.0.0 2022-05-18.
 *
 * @author Juan Diego Medina <juandiego619@gmail.com>, Luis Felipe Rivas <luisfelorivas@gmai.com>
 *
 * @since 1.0.0 2022-05-18.
 */
public class EnviosId extends Identity {
    private EnviosId(String id) {
        super(id);
    }

    public static EnviosId of(String id) {
        return new EnviosId(id);
    }
}
