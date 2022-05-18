package co.com.sofkau.entrenamiento.curso.paquete.identities;

import co.com.sofka.domain.generic.Identity;

/**
 * MensajeroID
 *
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */

public class MensajeroID extends Identity {
    private MensajeroID(String id) {
        super(id);
    }

    public static MensajeroID of(String id) {
        return new MensajeroID(id);
    }
}
