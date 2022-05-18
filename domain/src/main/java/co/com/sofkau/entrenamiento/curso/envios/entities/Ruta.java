package co.com.sofkau.entrenamiento.curso.envios.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.envios.identities.RutaId;
import co.com.sofkau.entrenamiento.curso.envios.values.Destino;
import co.com.sofkau.entrenamiento.curso.envios.values.Origen;
import co.com.sofkau.entrenamiento.curso.envios.values.Ubicacion;
/**
 * Representa la entidad ruta.
 *
 * @version 1.0.0 2022-05-18.
 *
 * @author Juan Diego Medina <juandiego619@gmail.com>, Luis Felipe Rivas <luisfelorivas@gmai.com>
 *
 * @since 1.0.0 2022-05-18.
 */
public class Ruta extends Entity<RutaId> {
    protected Origen origen;
    protected Destino destino;
    protected Ubicacion ubicacion;

    public Ruta(RutaId entityId) {
        super(entityId);
    }

    public void agregarRuta(Origen origen, Destino destino){
        this.origen=origen;
        this.destino=destino;
    }

    public void agregarUbicacion(Ubicacion ubicacion){
        this.ubicacion=ubicacion;
    }
    public Ubicacion ubicacion(){
        return  ubicacion;
    }
    public Origen origen(){
        return origen;
    }

    public Destino destino(){
        return destino;
    }
}
