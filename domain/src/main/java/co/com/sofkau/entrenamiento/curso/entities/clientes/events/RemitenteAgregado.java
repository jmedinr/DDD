package co.com.sofkau.entrenamiento.curso.entities.clientes.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.entities.clientes.value.Email;
import co.com.sofkau.entrenamiento.curso.entities.clientes.value.Nombre;
import co.com.sofkau.entrenamiento.curso.entities.clientes.value.Telefono;

public class RemitenteAgregado extends DomainEvent {
    private Nombre nombre;
    private Telefono telefono;
    private Email email;

    public RemitenteAgregado(Nombre nombre,Telefono telefono,Email email) {
        super("co.com.sofkau.entrenamiento.RemitenteAgregado");
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
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
