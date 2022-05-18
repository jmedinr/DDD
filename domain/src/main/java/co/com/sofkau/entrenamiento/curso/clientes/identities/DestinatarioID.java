package co.com.sofkau.entrenamiento.curso.clientes.identities;

import co.com.sofka.domain.generic.Identity;

public class DestinatarioID extends Identity {
    public DestinatarioID(String id){
        super(id);
    }
    public static DestinatarioID of(String id){
        return new DestinatarioID(id);
    }

}
