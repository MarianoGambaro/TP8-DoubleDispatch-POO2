package pt4;

public class ClienteRegular extends TipoCliente {

    private static final float IMPUESTO_REGULAR = 0.10f;

    @Override
    public float aplicarImpuestoDigital(float precioBase) {
        return precioBase * IMPUESTO_REGULAR;
    }
}
