package co.com.sofkau.entrenamiento.curso.envios.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envios.identities.FacturaId;
import co.com.sofkau.entrenamiento.curso.envios.values.*;

import java.util.Set;

public class FacturaGenerada extends DomainEvent {
    private final FacturaId facturaId;
    private final Nombre nombre;
    private final Fecha fecha;
    private final ValorTotal valorTotal;
    private final CantidadProductos cantidadProductos;
    private final Set<DatosEmpresa> datosEmpresa;


    public FacturaGenerada(FacturaId facturaId, Nombre nombre, Fecha fecha, ValorTotal valorTotal, CantidadProductos cantidadProductos, Set<DatosEmpresa> datosEmpresa) {
        super("co.com.sofkau.entrenamiento.FacturaGenerada");
        this.facturaId = facturaId;
        this.nombre = nombre;
        this.fecha = fecha;
        this.valorTotal = valorTotal;
        this.cantidadProductos = cantidadProductos;
        this.datosEmpresa = datosEmpresa;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public ValorTotal getValorTotal() {
        return valorTotal;
    }

    public CantidadProductos getCantidadProductos() {
        return cantidadProductos;
    }

    public Set<DatosEmpresa> getDatosEmpresa() {
        return datosEmpresa;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }
}
