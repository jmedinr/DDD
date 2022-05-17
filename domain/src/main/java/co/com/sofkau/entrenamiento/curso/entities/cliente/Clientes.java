package co.com.sofkau.entrenamiento.curso.entities.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.entrenamiento.curso.entities.ClienteId;
import co.com.sofkau.entrenamiento.curso.entities.Destinatario;
import co.com.sofkau.entrenamiento.curso.entities.Remitente;

public class Clientes extends AggregateEvent<ClienteId> {
     protected Remitente remitente;
     protected Destinatario destinatario;
}
