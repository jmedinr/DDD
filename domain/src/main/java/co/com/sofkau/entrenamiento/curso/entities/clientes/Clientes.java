package co.com.sofkau.entrenamiento.curso.entities.clientes;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.entrenamiento.curso.entities.clientes.entities.Destinatario;
import co.com.sofkau.entrenamiento.curso.entities.clientes.entities.Remitente;
import co.com.sofkau.entrenamiento.curso.entities.clientes.events.DestinatarioAgregado;
import co.com.sofkau.entrenamiento.curso.entities.clientes.events.RemitenteAgregado;
import co.com.sofkau.entrenamiento.curso.entities.clientes.identities.ClienteId;
import co.com.sofkau.entrenamiento.curso.entities.clientes.value.Email;
import co.com.sofkau.entrenamiento.curso.entities.clientes.value.Nombre;
import co.com.sofkau.entrenamiento.curso.entities.clientes.value.Telefono;

/**
 * Agregado ROOT Clientes
 * Se hacen metodos   principales del agregado para comunicacion con  sus entidades
 *
 * @Version 1.0
 * @Author Jhon Stiven Granada Acevedo
 * @Email ticen17.jsga@gmail.com
 * *
 */
public class Clientes extends AggregateEvent<ClienteId> {
     protected Remitente remitente;
     protected Destinatario destinatario;
     public Clientes(ClienteId entityId) {
          super(entityId);
     }
     public void agregarRemitente(Nombre nombre, Telefono telefono, Email email){
                appendChange(new RemitenteAgregado( nombre,telefono, email)).apply();
     }
     public void agregarDestinatario(Nombre nombre, Telefono telefono, Email email){
          appendChange(new DestinatarioAgregado( nombre,telefono, email)).apply();
     }
}
