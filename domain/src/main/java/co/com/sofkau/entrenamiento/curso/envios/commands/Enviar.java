package co.com.sofkau.entrenamiento.curso.envios.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.clientes.identities.ClienteId;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.envios.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.envios.values.Nombre;
import co.com.sofkau.entrenamiento.curso.paquete.identities.PaqueteID;

public class Enviar extends Command {
    private final EnviosId enviosId;
    private final PaqueteID paqueteID;
    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Descripcion descripcion;


    public Enviar(EnviosId enviosId, PaqueteID paqueteID, ClienteId clienteId, Nombre nombre, Descripcion descripcion) {
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
