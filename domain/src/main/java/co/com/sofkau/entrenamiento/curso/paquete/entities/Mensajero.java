package co.com.sofkau.entrenamiento.curso.paquete.entities;

import Identities.MensajeroID;
import co.com.sofka.domain.generic.Entity;
import Values.Nombre;
import Values.Telefono;

public class Mensajero extends Entity<MensajeroID> {


    public EMensajero(MensajeroID entityId) {
        super(entityId);
    }



    public void crearMensajero(Nombre nombre, Telefono telefono){

    }
}
