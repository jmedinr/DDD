package co.com.sofkau.entrenamiento.curso.entities.envios;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.entities.envios.identities.FacturaId;

public class facturaGeneradaEvents extends DomainEvent {
    private final FacturaId facturaId;


    public facturaGeneradaEvents(FacturaId facturaId) {
        super("co.com.sofkau.entrenamiento.facturaGenerada");
        this.facturaId = facturaId;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }
}
