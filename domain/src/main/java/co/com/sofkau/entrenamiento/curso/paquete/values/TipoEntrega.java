package Values;

import co.com.sofka.domain.generic.ValueObject;

public class TipoEntrega implements ValueObject<String> {
    private final String value;
    private final String Dinero;
    private final String Mercancia;
    private final String Documento;

    public TipoEntrega(String value, String dinero, String mercancia, String documento) {
        this.value = value;
        Dinero = dinero;
        Mercancia = mercancia;
        Documento = documento;
    }

    @Override
    public String value() {
        return value;
    }
}