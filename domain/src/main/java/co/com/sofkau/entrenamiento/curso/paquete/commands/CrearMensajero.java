package co.com.sofkau.entrenamiento.curso.paquete.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.paquete.identities.PaqueteID;
import co.com.sofkau.entrenamiento.curso.paquete.values.Nombre;
import co.com.sofkau.entrenamiento.curso.paquete.values.Telefono;

/**
 *
 * comando CrearMensajero
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */

public class CrearMensajero extends Command {
    private final PaqueteID paqueteID;
    private  final Nombre nombre;
    private  final Telefono telefono;

    public CrearMensajero(PaqueteID paqueteID, Nombre nombre, Telefono telefono) {
        this.paqueteID = paqueteID;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public PaqueteID getPaqueteID() {
        return paqueteID;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
