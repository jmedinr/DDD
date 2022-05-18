package co.com.sofkau.entrenamiento.curso.envios.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envios.values.Estado;

public class CambiarEstado extends Command {
    private Estado estado;

    public CambiarEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
