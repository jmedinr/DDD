package co.com.sofkau.entrenamiento.curso.paquete.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.paquete.identities.PaqueteID;
import co.com.sofkau.entrenamiento.curso.paquete.values.Peso;
import co.com.sofkau.entrenamiento.curso.paquete.values.TipoEntrega;
import co.com.sofkau.entrenamiento.curso.paquete.values.ValorAsegurado;
/**
 *
 * comando CrearEntrega
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */
public class CrearEntrega extends Command {
    private final PaqueteID paqueteID;
    private final TipoEntrega tipoEntrega;
    private final Peso peso;
    private final ValorAsegurado valorAsegurado;


    public CrearEntrega(PaqueteID paqueteID, TipoEntrega tipoEntrega, Peso peso, ValorAsegurado valorAsegurado) {
        this.paqueteID = paqueteID;
        this.tipoEntrega = tipoEntrega;
        this.peso = peso;
        this.valorAsegurado = valorAsegurado;
    }

    public PaqueteID getPaqueteID() {
        return paqueteID;
    }

    public TipoEntrega getTipoEntrega() {
        return tipoEntrega;
    }

    public Peso getPeso() {
        return peso;
    }

    public ValorAsegurado getValorAsegurado() {
        return valorAsegurado;
    }
}
