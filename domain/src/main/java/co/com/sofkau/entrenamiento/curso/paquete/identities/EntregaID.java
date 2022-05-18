package co.com.sofkau.entrenamiento.curso.paquete.identities;

import co.com.sofka.domain.generic.Identity;
/**
 *EntregaID
 *
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */
public class EntregaID extends Identity {

    private EntregaID(String id) {
        super(id);
    }

    public static EntregaID of(String id) {
        return new EntregaID(id);
    }
}


