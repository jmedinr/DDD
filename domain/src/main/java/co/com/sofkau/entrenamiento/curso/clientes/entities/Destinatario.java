package co.com.sofkau.entrenamiento.curso.clientes.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.clientes.identities.DestinatarioID;
import co.com.sofkau.entrenamiento.curso.clientes.value.Email;
import co.com.sofkau.entrenamiento.curso.clientes.value.Nombre;
import co.com.sofkau.entrenamiento.curso.clientes.value.Telefono;


public class Destinatario extends Entity<DestinatarioID> {

    private Nombre nombre;
    private Telefono telefono;
    private Email email;
    public Destinatario(DestinatarioID entityId, Nombre nombre, Telefono telefono, Email email) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public Destinatario(DestinatarioID entityId) {
        super(entityId);
    }

    public void consultarNombre(){

    }
    public void consultarTelefono(){

    } public void consultarEmail(){

    }
    public void modificarDestinatario(){

    }
    public void eliminarDestinatario(){

    } public void consultarDestinatario(){

    }
}
