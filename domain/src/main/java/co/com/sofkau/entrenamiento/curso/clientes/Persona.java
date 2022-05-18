package co.com.sofkau.entrenamiento.curso.clientes;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.clientes.entities.Destinatario;
import co.com.sofkau.entrenamiento.curso.clientes.entities.Remitente;
import co.com.sofkau.entrenamiento.curso.clientes.identities.PersonaId;

public class Persona extends Entity<PersonaId> {
    private Remitente remitente;
    private Destinatario destinatario;

    public Persona(PersonaId entityId, Remitente remitente, Destinatario destinatario) {
        super(entityId);
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    public Remitente getRemitente() {
        return remitente;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }
}
