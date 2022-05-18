package co.com.sofkau.entrenamiento.curso.entities.clientes.identities;

import co.com.sofka.domain.generic.Identity;
/**
 * Identite ClienteId
 *
 * @Version 1.0
 * @Author Jhon Stiven Granada Acevedo
 * @Email ticen17.jsga@gmail.com
 * *
 */
public class ClienteId extends Identity {
    public ClienteId(String id){
        super(id);
    }
    public static ClienteId of(String id){
        return new ClienteId(id);
    }
}
