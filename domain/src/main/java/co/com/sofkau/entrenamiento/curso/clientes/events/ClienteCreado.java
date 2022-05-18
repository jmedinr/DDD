package co.com.sofkau.entrenamiento.curso.clientes.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.clientes.entities.Destinatario;
import co.com.sofkau.entrenamiento.curso.clientes.entities.Remitente;
import co.com.sofkau.entrenamiento.curso.clientes.identities.ClienteId;

public class ClienteCreado extends DomainEvent {


    private final ClienteId clienteId;
    public ClienteCreado( ClienteId clienteId) {
        super("co.com.sofkau.entrenamiento.ClienteCreado");

        this.clienteId = clienteId;
    }




    public  ClienteId getClienteId(){
        return  clienteId;
    }

}
