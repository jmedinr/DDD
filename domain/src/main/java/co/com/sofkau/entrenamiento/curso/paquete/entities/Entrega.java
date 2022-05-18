package co.com.sofkau.entrenamiento.curso.paquete.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.paquete.events.PaqueteCreado;
import co.com.sofkau.entrenamiento.curso.paquete.identities.EntregaID;
import co.com.sofkau.entrenamiento.curso.paquete.values.*;
import co.com.sofkau.entrenamiento.curso.paquete.values.Mensajero;

/**
 * Entidad Entrega
 * Se hacen metodos get  de todos sus atributos y metodo crearEntrega
 *
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */
public class Entrega  extends Entity<EntregaID> {

    protected TipoEntrega tipoEntrega;
    protected Peso peso;
    protected ValorAsegurado valorAsegurado;

    public Entrega(EntregaID entityId) {
        super(entityId);
    }

    public TipoEntrega getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(TipoEntrega tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public Peso getPeso() {
        return peso;
    }

    public void setPeso(Peso peso) {
        this.peso = peso;
    }

    public ValorAsegurado getValorAsegurado() {
        return valorAsegurado;
    }

    public void setValorAsegurado(ValorAsegurado valorAsegurado) {
        this.valorAsegurado = valorAsegurado;
    }

    public void crearEntrega(TipoEntrega tipoEntrega , Peso peso, ValorAsegurado valorAsegurado){

    }
}

