package co.com.sofkau.entrenamiento.curso.paquete.entities;


import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.paquete.identities.MensajeroID;
import co.com.sofkau.entrenamiento.curso.paquete.values.*;

/**
 * Entidad Mensajero
 * Se hacen metodos get de todos sus atributos y metodo crearMensajero
 *
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */

public class Mensajero extends Entity<MensajeroID> {


    protected Nombre nombre;

    protected Telefono telefono;


    public Mensajero(MensajeroID entityId) {
        super(entityId);
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void crearMensajero(Nombre nombre, Telefono telefono) {

    }
}

