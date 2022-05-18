package co.com.sofkau.entrenamiento.curso.envios;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.entrenamiento.curso.envios.entities.Factura;
import co.com.sofkau.entrenamiento.curso.envios.events.*;
import co.com.sofkau.entrenamiento.curso.envios.values.Estado;
/**
 * Representa objeto que controla los eventos en el agregado envios.
 *
 * @version 1.0.0 2022-05-18.
 *
 * @author Juan Diego Medina <juandiego619@gmail.com>, Luis Felipe Rivas <luisfelorivas@gmai.com>
 *
 * @since 1.0.0 2022-05-18.
 */
public class EnviosChange extends EventChange {
    public EnviosChange(Envios envios) {

        apply((FacturaGenerada event) -> {
            var facturaId = event.getFacturaId();
            var factura = new Factura(facturaId, event.getNombre(),
                    event.getFecha(), event.getValorTotal(), event.getCantidadProductos(), event.getDatosEmpresa());
            envios.factura = factura;
        });

        apply((EnvioLocalizado event) -> {
            var ubicacion = event.getUbicacion();
            envios.ruta.agregarUbicacion(ubicacion);
        });

        apply((RutaAgregada event) -> {
            envios.ruta.agregarRuta(event.getOrigen(), event.getDestino());
        });

        apply((CambioEstado event) -> {
            var estado = event.getEstado();
            envios.estado = estado;
        });

        apply((Enviado event) -> {
            envios.estado = new Estado(Estado.Estados.DESPACHADO);
        });
    }
}
