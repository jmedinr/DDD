package co.com.sofkau.entrenamiento.curso.clientes;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.entrenamiento.curso.clientes.events.ClienteCreado;
import co.com.sofkau.entrenamiento.curso.clientes.events.DestinatarioAgregado;
import co.com.sofkau.entrenamiento.curso.clientes.events.RemitenteAgregado;

import java.util.HashMap;

public class ClienteEventChange extends EventChange {
    public ClienteEventChange(Clientes clientes) {
        apply((ClienteCreado event) -> {
            clientes.destinatario = new HashMap<>();
            clientes.remitente = new HashMap<>();

        });
        apply((DestinatarioAgregado event) -> {
            clientes.destinatarioAgregado = Boolean.TRUE;
        });
        apply((RemitenteAgregado event) -> {
            clientes.remitenteAgregado = Boolean.TRUE;
        });
    }
}
