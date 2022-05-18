package co.com.sofkau.entrenamiento.curso.clientes.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.clientes.identities.RemitenteId;
import co.com.sofkau.entrenamiento.curso.clientes.value.Email;
import co.com.sofkau.entrenamiento.curso.clientes.value.Nombre;
import co.com.sofkau.entrenamiento.curso.clientes.value.Telefono;


public class Remitente extends Entity<RemitenteId> {

    private Nombre nombre;
    private Telefono telefono;
    private Email email;

    public Remitente(RemitenteId entityId, Nombre nombre, Telefono telefono, Email email) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public Remitente(RemitenteId entityId) {
        super(entityId);
    }

    public void consultarNombre() {

    }

    public void consultarTelefono() {

    }

    public void consultarEmail() {

    }

    public void modificarRemitente() {

    }

    public void eliminarRemitente() {

    }

    public void consultarRemitente() {

    }
}
