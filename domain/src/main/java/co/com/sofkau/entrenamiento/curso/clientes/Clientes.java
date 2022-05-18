package co.com.sofkau.entrenamiento.curso.clientes;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.entrenamiento.curso.clientes.entities.Destinatario;
import co.com.sofkau.entrenamiento.curso.clientes.entities.Remitente;
import co.com.sofkau.entrenamiento.curso.clientes.events.ClienteCreado;
import co.com.sofkau.entrenamiento.curso.clientes.factory.ClientesFactory;
import co.com.sofkau.entrenamiento.curso.clientes.identities.ClienteId;
import co.com.sofkau.entrenamiento.curso.clientes.identities.DestinatarioID;
import co.com.sofkau.entrenamiento.curso.clientes.identities.PersonaId;
import co.com.sofkau.entrenamiento.curso.clientes.identities.RemitenteId;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.paquete.identities.PaqueteID;

import java.util.Map;


public class Clientes extends AggregateEvent<ClienteId> {
    protected EnviosId enviosId;
    protected PaqueteID paqueteID;
    protected boolean destinatarioAgregado;
    protected boolean remitenteAgregado;
    protected Map<RemitenteId, Remitente> remitente;
    protected Map<DestinatarioID, Destinatario> destinatario;

    public Clientes(ClienteId entityId) {

        super(entityId);
        appendChange(new ClienteCreado(enviosId, paqueteID, entityId)).apply();
        subscribe(new ClienteEventChange(this));
        ClientesFactory.builder()
                .personas()
                .forEach(persona -> agregarCliente(persona.identity(), persona.getRemitente(), persona.getDestinatario()));

    }

    public void agregarCliente(PersonaId personaId, Remitente remitente, Destinatario destinatario) {

    }

    public boolean isDestinatarioAgregado() {
        return destinatarioAgregado;
    }

    public boolean isRemitenteAgregado() {
        return remitenteAgregado;
    }
}
