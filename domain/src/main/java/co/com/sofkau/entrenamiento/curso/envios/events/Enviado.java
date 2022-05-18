package co.com.sofkau.entrenamiento.curso.envios.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.clientes.identities.ClienteId;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.envios.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.envios.values.Nombre;
import co.com.sofkau.entrenamiento.curso.paquete.identities.PaqueteID;

public class Enviado extends DomainEvent {
    private final EnviosId enviosId;
    private final PaqueteID paqueteID;
    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Descripcion descripcion;


    public Enviado(EnviosId enviosId, PaqueteID paqueteID, ClienteId clienteId, Nombre nombre, Descripcion descripcion) {
        super("co.com.sofkau.entrenamiento.enviado");
        this.enviosId = enviosId;
        this.paqueteID = paqueteID;
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public PaqueteID getPaqueteID() {
        return paqueteID;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public EnviosId getEnviosId() {
        return enviosId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
