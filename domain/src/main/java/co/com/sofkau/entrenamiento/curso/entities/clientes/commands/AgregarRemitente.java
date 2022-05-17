package co.com.sofkau.entrenamiento.curso.entities.clientes.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.entities.clientes.value.Email;
import co.com.sofkau.entrenamiento.curso.entities.clientes.value.Nombre;
import co.com.sofkau.entrenamiento.curso.entities.clientes.value.Telefono;

public class AgregarRemitente extends Command {
    private Nombre nombre;
    private Telefono telefono;
    private Email email;
}
