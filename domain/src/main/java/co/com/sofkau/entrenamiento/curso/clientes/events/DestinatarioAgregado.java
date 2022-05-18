package co.com.sofkau.entrenamiento.curso.clientes.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.clientes.identities.DestinatarioID;
import co.com.sofkau.entrenamiento.curso.clientes.value.Email;
import co.com.sofkau.entrenamiento.curso.clientes.value.Nombre;
import co.com.sofkau.entrenamiento.curso.clientes.value.Telefono;
/**
 * Evento DestinatarioAgregado
 * Se hacen metodos  get de cada atributo heredado
 *
 * @Version 1.0
 * @Author Jhon Stiven Granada Acevedo
 * @Email ticen17.jsga@gmail.com
 * *
 */

public class DestinatarioAgregado extends DomainEvent {
    private DestinatarioID destinatarioID;
    private Nombre nombre;
    private Telefono telefono;
    private Email email;


    public DestinatarioAgregado(DestinatarioID destinatarioID, Nombre nombre, Telefono telefono, Email email) {
        super("co.com.sofkau.entrenamiento.DestinatarioAgregado");
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.destinatarioID = destinatarioID;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Email getEmail() {
        return email;
    }

    public DestinatarioID getDestinatarioID() {
        return destinatarioID;
    }
}
