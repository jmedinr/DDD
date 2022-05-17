package co.com.sofkau.entrenamiento.curso.entities;

import co.com.sofka.domain.generic.AggregateEvent;

public class Clientes extends AggregateEvent<ClienteId> {
     protected  Remitente remitente;
     protected  Destinatario destinatario;
}
