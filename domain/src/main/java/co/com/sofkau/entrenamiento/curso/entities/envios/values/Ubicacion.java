package co.com.sofkau.entrenamiento.curso.entities.envios.values;

import co.com.sofka.domain.generic.ValueObject;

public class Ubicacion implements ValueObject<Ubicacion.Pros> {
    private final String actual;
    private final String origen;
    private final String destino;

    public Ubicacion(String actual, String origen, String destino) {
        this.actual = actual;
        this.origen = origen;
        this.destino = destino;
    }

    @Override
    public Pros value() {
        return new Pros() {
            @Override
            public String actual() {
                return actual;
            }

            @Override
            public String origen() {
                return origen;
            }

            @Override
            public String destino() {
                return destino;
            }
        }
    }


    public interface Pros{
        String actual();
        String origen();
        String destino();

    }

}
