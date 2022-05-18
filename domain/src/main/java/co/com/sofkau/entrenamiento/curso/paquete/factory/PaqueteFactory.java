package co.com.sofkau.entrenamiento.curso.paquete.factory;


import co.com.sofkau.entrenamiento.curso.paquete.Paquete;

import java.util.HashSet;
import java.util.Set;

/**
 * PaqueteFactory
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */

public class PaqueteFactory {

    private static Set<Paquete> paquetes = null;

    private PaqueteFactory() {
        paquetes = new HashSet<>();
    }


    public static PaqueteFactory builder() {
        return new PaqueteFactory();
    }

    public static Set<Paquete> listaPaquetes() {
        return paquetes;
    }


}

