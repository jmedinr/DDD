package co.com.sofkau.entrenamiento.curso.envios.factory;

import co.com.sofkau.entrenamiento.curso.clientes.identities.ClienteId;
import co.com.sofkau.entrenamiento.curso.envios.Envios;
import co.com.sofkau.entrenamiento.curso.envios.entities.Factura;
import co.com.sofkau.entrenamiento.curso.envios.entities.Ruta;
import co.com.sofkau.entrenamiento.curso.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.envios.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.envios.values.Estado;
import co.com.sofkau.entrenamiento.curso.envios.values.Fecha;
import co.com.sofkau.entrenamiento.curso.envios.values.Nombre;
import co.com.sofkau.entrenamiento.curso.paquete.identities.PaqueteID;

import java.util.HashSet;
import java.util.Set;

public class EnviosFactory {
    private static Set<Envios> envios = null;

    private EnviosFactory(){envios = new HashSet<>();}

    public static EnviosFactory builder(){return new EnviosFactory();}

    public static Set<Envios> listaEnvios(){return envios;}

    public EnviosFactory nuevoEnvio(EnviosId enviosId, PaqueteID paqueteID, ClienteId clienteId, Nombre nombre, Descripcion descipcion, Fecha fecha,
                                    Estado estado, Ruta ruta, Factura factura){
        envios.add(new Envios(enviosId, paqueteID, clienteId, nombre, descipcion, fecha, estado, ruta, factura));
        return this;
    }


}
