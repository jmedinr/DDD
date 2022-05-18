package co.com.sofkau.entrenamiento.curso.clientes.identities;

import co.com.sofka.domain.generic.Identity;
/**
 * Identite RemitenteId
 *
 * @Version 1.0
 * @Author Jhon Stiven Granada Acevedo
 * @Email ticen17.jsga@gmail.com
 * *
 */
public class RemitenteId extends Identity {
    public RemitenteId(String id){
        super(id);
    }
    public static RemitenteId of(String id){
        return new RemitenteId(id);
    }
}
