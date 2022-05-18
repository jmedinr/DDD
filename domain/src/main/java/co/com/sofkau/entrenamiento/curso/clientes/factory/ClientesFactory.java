package co.com.sofkau.entrenamiento.curso.clientes.factory;

import co.com.sofkau.entrenamiento.curso.clientes.Clientes;

import java.util.HashSet;
import java.util.Set;

public class ClientesFactory {

    public Set<Clientes> getClientes() {
        return clientes;
    }

    private static final Set<Clientes> clientes = new HashSet<>();

    public ClientesFactory() {
    }

    public  ClientesFactory agregarCliente(Clientes cliente) {
        clientes.add(cliente);
        return this;
    }

    public static ClientesFactory builder() {
        return new ClientesFactory();
    }

}
