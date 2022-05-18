package co.com.sofkau.entrenamiento.curso.paquete.identities;

import co.com.sofka.domain.generic.Identity;

/**
 * PaqueteID
 *
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */

public class PaqueteID extends Identity {
    private PaqueteID(String id) {
        super(id);
    }

    public static PaqueteID of(String id) {
        return new PaqueteID(id);
    }

}
