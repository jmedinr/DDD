package entities;

import Identities.MensajeroID;
import co.com.sofka.domain.generic.Entity;
import Values.Nombre;
import Values.Telefono;

public class EMensajero extends Entity<MensajeroID> {


    public EMensajero(MensajeroID entityId) {
        super(entityId);
    }



    public void crearMensajero(Nombre nombre, Telefono telefono){

    }
}
