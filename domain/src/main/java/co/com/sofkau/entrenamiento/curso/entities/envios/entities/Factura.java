package co.com.sofkau.entrenamiento.curso.entities.envios.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.entities.envios.identities.FacturaId;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.*;

import java.util.Set;

public class Factura extends Entity<FacturaId> {

    private final Nombre nombre;
    private final Fecha fecha;
    private final ValorTotal valorTotal;
    private final CantidadProductos cantidadProductos;
    private final Set<DatosEmpresa> datosEmpresa;

    public Factura(FacturaId entityId, Nombre nombre, Fecha fecha, ValorTotal valorTotal, CantidadProductos cantidadProductos, Set<DatosEmpresa> datosEmpresa) {
        super(entityId);
        this.nombre = nombre;
        this.fecha = fecha;
        this.valorTotal = valorTotal;
        this.cantidadProductos = cantidadProductos;
        this.datosEmpresa = datosEmpresa;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Fecha fecha() {
        return fecha;
    }

    public ValorTotal valorTotal() {
        return valorTotal;
    }

    public CantidadProductos cantidadProductos() {
        return cantidadProductos;
    }

    public Set<DatosEmpresa> datosEmpresa() {
        return datosEmpresa;
    }
}
