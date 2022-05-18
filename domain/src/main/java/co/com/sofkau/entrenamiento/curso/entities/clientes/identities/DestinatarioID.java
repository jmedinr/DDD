package co.com.sofkau.entrenamiento.curso.entities.clientes.identities;

import co.com.sofka.domain.generic.Identity;
/**
 * Identite DestinatarioID
 *
 * @Version 1.0
 * @Author Jhon Stiven Granada Acevedo
 * @Email ticen17.jsga@gmail.com
 * *
 */
public class DestinatarioID extends Identity {
    public DestinatarioID(String id){
        super(id);
    }
    public static DestinatarioID of(String id){
        return new DestinatarioID(id);
    }

}
