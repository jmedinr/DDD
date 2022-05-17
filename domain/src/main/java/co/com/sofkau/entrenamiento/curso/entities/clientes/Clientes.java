package co.com.sofkau.entrenamiento.curso.entities.clientes;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.entrenamiento.curso.entities.clientes.entities.Destinatario;
import co.com.sofkau.entrenamiento.curso.entities.clientes.entities.Remitente;
import co.com.sofkau.entrenamiento.curso.entities.clientes.identities.ClienteId;


public class Clientes extends AggregateEvent<ClienteId> {
     protected Remitente remitente;
     protected Destinatario destinatario;

     public Clientes(ClienteId entityId) {
          super(entityId);
     }
}
