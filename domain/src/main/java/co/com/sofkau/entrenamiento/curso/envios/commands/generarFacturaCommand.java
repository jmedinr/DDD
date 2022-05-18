package co.com.sofkau.entrenamiento.curso.envios.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envios.identities.FacturaId;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.*;
import co.com.sofkau.entrenamiento.curso.envios.values.*;

import java.io.Serializable;
import java.util.List;

public class generarFacturaCommand extends Command {
    private final List<TuplaFactura> tuplaFactura;
    private final FacturaId facturaId;


    public generarFacturaCommand(List<TuplaFactura> tuplaFactura, FacturaId facturaId) {
        this.tuplaFactura = tuplaFactura;
        this.facturaId = facturaId;
    }

    public List<TuplaFactura> getTuplaFactura() {
        return tuplaFactura;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public static class TuplaFactura implements Serializable {
        private Nombre nombre;
        private Fecha fecha;
        private ValorTotal valorTotal;
        private CantidadProductos cantidadProductos;
        private DatosEmpresa datosEmpresa;

        public TuplaFactura(Nombre nombre, Fecha fecha, ValorTotal valorTotal,
                            CantidadProductos cantidadProductos, DatosEmpresa datosEmpresa) {
            this.nombre = nombre;
            this.fecha = fecha;
            this.valorTotal = valorTotal;
            this.cantidadProductos = cantidadProductos;
            this.datosEmpresa = datosEmpresa;
        }

        public TuplaFactura() {
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

        public DatosEmpresa getDatosEmpresa() {
            return datosEmpresa;
        }
    }

}
