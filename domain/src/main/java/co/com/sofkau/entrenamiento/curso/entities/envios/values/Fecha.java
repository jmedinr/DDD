package co.com.sofkau.entrenamiento.curso.entities.envios.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Fecha implements ValueObject<Fecha.Pros> {
    private final LocalDateTime hora;
    private final LocalDate dia;

    public Fecha(LocalDateTime hora, LocalDate dia) {
        this.hora = hora;
        this.dia = dia;
    }

    @Override
    public Pros value() {
        return new Pros() {
            @Override
            public LocalDateTime hora() {
                return hora;
            }

            @Override
            public LocalDate dia() {
                return dia;
            }
        };
    }

    public interface Pros{
        LocalDateTime hora();
        LocalDate dia();
    }
}
