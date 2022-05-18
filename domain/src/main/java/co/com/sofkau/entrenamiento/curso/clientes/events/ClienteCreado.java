package co.com.sofkau.entrenamiento.curso.clientes.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.clientes.identities.ClienteId;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.paquete.identities.PaqueteID;

public class ClienteCreado extends DomainEvent {

    private final EnviosId enviosId;
    private final PaqueteID paqueteID;
    private final ClienteId clienteId;

    public ClienteCreado(EnviosId enviosId, PaqueteID paqueteID, ClienteId clienteId) {
        super("co.com.sofkau.entrenamiento.ClienteCreado");
        this.enviosId = enviosId;
        this.paqueteID = paqueteID;

        this.clienteId = clienteId;
    }

    public EnviosId getEnviosId() {
        return enviosId;
    }

    public PaqueteID getPaqueteID() {
        return paqueteID;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

}
