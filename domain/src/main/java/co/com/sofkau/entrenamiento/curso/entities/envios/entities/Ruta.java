package co.com.sofkau.entrenamiento.curso.entities.envios.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.entities.envios.identities.RutaId;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Ubicacion;

public class Ruta extends Entity<RutaId> {
    protected Ubicacion ubicacion;

    public Ruta(RutaId entityId) {
        super(entityId);
    }
}
