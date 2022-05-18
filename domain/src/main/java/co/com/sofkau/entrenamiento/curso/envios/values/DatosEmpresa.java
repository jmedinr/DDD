package co.com.sofkau.entrenamiento.curso.envios.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DatosEmpresa implements ValueObject<DatosEmpresa.Value> {

    private final String nombreEmpresa;
    private final String descripcion;

    public DatosEmpresa(String nombreEmpresa, String descripcion) {
        //TODO: Validaciones
        this.nombreEmpresa = nombreEmpresa;
        this.descripcion = descripcion;
    }

    @Override
    public DatosEmpresa.Value value() {
        return new Value() {
            @Override
            public String nombreEmpresa() {
                return nombreEmpresa;
            }

            @Override
            public String descripcion() {
                return descripcion;
            }
        };
    }

    public interface Value {
        String nombreEmpresa();

        String descripcion();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DatosEmpresa)) return false;
        DatosEmpresa that = (DatosEmpresa) o;
        return Objects.equals(nombreEmpresa, that.nombreEmpresa) && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreEmpresa, descripcion);
    }
}
