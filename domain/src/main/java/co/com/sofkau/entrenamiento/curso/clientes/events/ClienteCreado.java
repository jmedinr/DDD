package co.com.sofkau.entrenamiento.curso.clientes.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.clientes.identities.ClienteId;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.paquete.identities.PaqueteID;

public class ClienteCreado extends DomainEvent {

    private final EnviosId enviosId;
    private final ClienteId clienteId;

    public ClienteCreado(EnviosId enviosId, ClienteId clienteId) {
        super("co.com.sofkau.entrenamiento.ClienteCreado");
        this.enviosId = enviosId;

        this.clienteId = clienteId;
    }

    public EnviosId getEnviosId() {
        return enviosId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

}
