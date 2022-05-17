package co.com.sofkau.entrenamiento.curso.entities;

import co.com.sofka.domain.generic.Entity;

public class Ruta extends Entity<RutaId> {
    protected Ubicacion ubicacion;

    public Ruta(RutaId entityId) {
        super(entityId);
    }
}
