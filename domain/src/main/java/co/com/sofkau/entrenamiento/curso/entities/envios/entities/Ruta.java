package co.com.sofkau.entrenamiento.curso.entities.envios.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.entities.envios.identities.RutaId;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Destino;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Origen;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Ubicacion;

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