package co.com.sofkau.entrenamiento.curso.clientes.factory;


import co.com.sofkau.entrenamiento.curso.clientes.Persona;
import java.util.HashSet;
import java.util.Set;

public class ClientesFactory {

    private static final Set<Persona> personas = new HashSet<>();

    public Set<Persona> personas() {
        return personas;
    }

    public static ClientesFactory builder() {
        return new ClientesFactory();
    }

}
