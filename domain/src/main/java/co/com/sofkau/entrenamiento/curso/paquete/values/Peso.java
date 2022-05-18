package Values;

import co.com.sofka.domain.generic.ValueObject;

public class Peso implements ValueObject<Double> {
    private final Double value;

    public Peso(Double value) {
        this.value = value;
    }


    @Override
    public Double value() {
        return value;
    }
}
