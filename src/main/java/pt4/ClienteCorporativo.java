package pt4;

public class ClienteCorporativo extends TipoCliente {

    private static final float DESCUENTO_ENVIO = 0.5f;

    @Override
    public float aplicarDescuentoEnvio(float precioServicio) {
        return precioServicio - (precioServicio * DESCUENTO_ENVIO);
    }
}
