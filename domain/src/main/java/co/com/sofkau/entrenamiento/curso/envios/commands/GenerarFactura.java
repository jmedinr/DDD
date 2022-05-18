package co.com.sofkau.entrenamiento.curso.envios.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envios.identities.FacturaId;
import co.com.sofkau.entrenamiento.curso.envios.values.*;

import java.io.Serializable;
import java.util.List;
/**
 * Representa el comando que genera la factura del envio.
 *
 * @version 1.0.0 2022-05-18.
 *
 * @author Juan Diego Medina <juandiego619@gmail.com>, Luis Felipe Rivas <luisfelorivas@gmai.com>
 *
 * @since 1.0.0 2022-05-18.
 */
public class GenerarFactura extends Command {
    private final List<TuplaFactura> tuplaFactura;
    private final FacturaId facturaId;


    public GenerarFactura(List<TuplaFactura> tuplaFactura, FacturaId facturaId) {
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
