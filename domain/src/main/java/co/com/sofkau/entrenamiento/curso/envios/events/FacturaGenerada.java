package co.com.sofkau.entrenamiento.curso.envios.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envios.identities.FacturaId;
import co.com.sofkau.entrenamiento.curso.envios.values.*;

import java.util.Set;
/**
 * Representa el evento cuando la factura del envio es generada.
 *
 * @version 1.0.0 2022-05-18.
 *
 * @author Juan Diego Medina <juandiego619@gmail.com>, Luis Felipe Rivas <luisfelorivas@gmai.com>
 *
 * @since 1.0.0 2022-05-18.
 */
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
