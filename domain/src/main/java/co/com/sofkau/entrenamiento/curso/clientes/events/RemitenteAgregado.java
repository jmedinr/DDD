package co.com.sofkau.entrenamiento.curso.clientes.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.clientes.identities.RemitenteId;
import co.com.sofkau.entrenamiento.curso.clientes.value.Email;
import co.com.sofkau.entrenamiento.curso.clientes.value.Nombre;
import co.com.sofkau.entrenamiento.curso.clientes.value.Telefono;
/**
 * Evento RemitenteAgregado
 * Se hacen metodos  get de cada atributo heredado
 *
 * @Version 1.0
 * @Author Jhon Stiven Granada Acevedo
 * @Email ticen17.jsga@gmail.com
 * *
 */
public class RemitenteAgregado extends DomainEvent {
    private Nombre nombre;
    private Telefono telefono;
    private Email email;
    private RemitenteId remitenteId;

    public RemitenteId getRemitenteId() {
        return remitenteId;
    }

    public RemitenteAgregado(RemitenteId remitenteId, Nombre nombre, Telefono telefono, Email email) {
        super("co.com.sofkau.entrenamiento.RemitenteAgregado");
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.remitenteId = remitenteId;
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
}
