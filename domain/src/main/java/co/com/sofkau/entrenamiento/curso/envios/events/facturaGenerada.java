package co.com.sofkau.entrenamiento.curso.envios.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envios.identities.FacturaId;

public class facturaGenerada extends DomainEvent {
    private final FacturaId facturaId;


    public facturaGenerada(FacturaId facturaId) {
        super("co.com.sofkau.entrenamiento.facturaGenerada");
        this.facturaId = facturaId;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }
}
