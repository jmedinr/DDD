package co.com.sofkau.entrenamiento.curso.envios.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envios.values.Ubicacion;
/**
 * Representa el evento cuando se le agrega una ubicacion al envio.
 *
 * @version 1.0.0 2022-05-18.
 *
 * @author Juan Diego Medina <juandiego619@gmail.com>, Luis Felipe Rivas <luisfelorivas@gmai.com>
 *
 * @since 1.0.0 2022-05-18.
 */
public class EnvioLocalizado extends DomainEvent {
    private final Ubicacion ubicacion;

    public EnvioLocalizado(Ubicacion ubicacion) {
        super("co.com.sofkau.entrenamiento.curso.entities.EnvioLocalizado");
        this.ubicacion = ubicacion;

    }
    public Ubicacion getUbicacion() {
        return ubicacion;
    }

}
