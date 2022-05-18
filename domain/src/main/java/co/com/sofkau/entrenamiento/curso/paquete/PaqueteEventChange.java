package co.com.sofkau.entrenamiento.curso.paquete;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.entrenamiento.curso.paquete.events.PaqueteCreado;

/**
 * PaqueteEventChange es el  encargado de disparar los diferentes eventos de nuestro agregado Paquete
 *
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */
public class PaqueteEventChange extends EventChange {

    public PaqueteEventChange(Paquete paquete) {
        apply((PaqueteCreado event) -> {

            paquete.nombre = event.getNombre();
            paquete.mensajero = event.getMensajero();
            paquete.entrega = event.getEntrega();
            paquete.descripcion = event.getDescripcion();
            paquete.enviosId = event.getEnviosId();

        });

    }
}
