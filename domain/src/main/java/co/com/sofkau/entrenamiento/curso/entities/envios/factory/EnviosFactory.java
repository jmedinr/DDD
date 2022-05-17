package co.com.sofkau.entrenamiento.curso.entities.envios.factory;

import co.com.sofkau.entrenamiento.curso.entities.envios.Envios;
import co.com.sofkau.entrenamiento.curso.entities.envios.entities.Factura;
import co.com.sofkau.entrenamiento.curso.entities.envios.entities.Ruta;
import co.com.sofkau.entrenamiento.curso.entities.envios.identities.EnviosId;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Estado;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Fecha;
import co.com.sofkau.entrenamiento.curso.entities.envios.values.Nombre;

import java.util.HashSet;
import java.util.Set;

public class EnviosFactory {
    private static Set<Envios> envios = null;

    private EnviosFactory(){envios = new HashSet<>();}

    public static EnviosFactory builder(){return new EnviosFactory();}

    public static Set<Envios> listaEnvios(){return envios;}

    public EnviosFactory nuevoEnvio(EnviosId enviosId, Nombre nombre, Descripcion descipcion, Fecha fecha,
                                    Estado estado, Ruta ruta, Factura factura){
        envios.add(new Envios(enviosId,nombre, descipcion, fecha, estado, ruta, factura));
        return this;
    }


}
