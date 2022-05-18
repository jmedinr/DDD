package co.com.sofkau.entrenamiento.curso.clientes.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.clientes.identities.ClienteId;
import co.com.sofkau.entrenamiento.curso.clientes.value.Email;
import co.com.sofkau.entrenamiento.curso.clientes.value.Nombre;
import co.com.sofkau.entrenamiento.curso.clientes.value.Telefono;
/**
 * Comando  AgregarRemitente
 *
 * @Version 1.0
 * @Author Jhon Stiven Granada Acevedo
 * @Email ticen17.jsga@gmail.com
 * *
 */
public class AgregarRemitente extends Command {
    private ClienteId clienteId;
    private Nombre nombre;
    private Telefono telefono;
    private Email email;

    public AgregarRemitente(ClienteId clienteId, Nombre nombre, Telefono telefono, Email email) {
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public ClienteId getClienteId() {
        return clienteId;
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
