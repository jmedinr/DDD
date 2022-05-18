package co.com.sofkau.entrenamiento.curso.clientes;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.entrenamiento.curso.clientes.entities.Destinatario;
import co.com.sofkau.entrenamiento.curso.clientes.entities.Remitente;
import co.com.sofkau.entrenamiento.curso.clientes.events.ClienteCreado;
import co.com.sofkau.entrenamiento.curso.clientes.events.DestinatarioAgregado;
import co.com.sofkau.entrenamiento.curso.clientes.events.RemitenteAgregado;
import co.com.sofkau.entrenamiento.curso.clientes.factory.ClientesFactory;
import co.com.sofkau.entrenamiento.curso.clientes.identities.ClienteId;
import co.com.sofkau.entrenamiento.curso.clientes.identities.DestinatarioID;
import co.com.sofkau.entrenamiento.curso.clientes.identities.RemitenteId;
import co.com.sofkau.entrenamiento.curso.clientes.value.Email;
import co.com.sofkau.entrenamiento.curso.clientes.value.Nombre;
import co.com.sofkau.entrenamiento.curso.clientes.value.Telefono;

import java.util.Map;


public class Clientes extends AggregateEvent<ClienteId> {

     public boolean isDestinatarioAgregado() {
          return destinatarioAgregado;
     }

     public boolean isRemitenteAgregado() {
          return remitenteAgregado;
     }
     protected  boolean destinatarioAgregado;
     protected  boolean remitenteAgregado;
     protected Map<RemitenteId,Remitente> remitente ;
     protected Map<DestinatarioID,Destinatario> destinatario;
     public Clientes(ClienteId entityId) {

          super(entityId);
          appendChange(new ClienteCreado(entityId)).apply();
          subscribe(new ClienteEventChange(this));
        //  agregarCliente();
        // new ClientesFactory().agregarCliente()

     }
     public  void  agregarUser(ClienteId clienteId, Remitente remitente ,Destinatario destinatario){

     }
     public void agregarRemitente(RemitenteId remitenteId,Nombre nombre, Telefono telefono, Email email){
                appendChange(new RemitenteAgregado(remitenteId,nombre,telefono, email)).apply();
     }
     public void agregarDestinatario(DestinatarioID destinatarioID,Nombre nombre, Telefono telefono, Email email){
          appendChange(new DestinatarioAgregado( destinatarioID, nombre,telefono, email)).apply();
     }
}
