package co.com.sofkau.entrenamiento.curso.clientes.identities;

import co.com.sofka.domain.generic.Identity;
/**
 * Identite PersonaId
 *
 * @Version 1.0
 * @Author Jhon Stiven Granada Acevedo
 * @Email ticen17.jsga@gmail.com
 * *
 */
public class PersonaId extends Identity {

    public PersonaId(String id) {
        super(id);
    }

    public static PersonaId of(String id) {
        return new PersonaId(id);
    }

}
