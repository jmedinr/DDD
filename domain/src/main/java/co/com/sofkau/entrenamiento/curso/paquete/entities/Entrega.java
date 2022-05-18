package entities;


import Identities.EntregaID;
import co.com.sofka.domain.generic.Entity;


public class IEntrega  extends Entity<EntregaID> {

    protected Values.TipoEntrega tipoEntrega;
    protected Values.Peso peso;
    protected Values.ValorAsegurado valorAsegurado;
    public IEntrega(EntregaID entityId) {
        super(entityId);
    }

    public Values.TipoEntrega getTipoEntrega() {
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
