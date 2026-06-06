package pt4;

public abstract class TipoCliente {

    public float aplicarImpuestoDigital(float precioBase) {
        return 0; //por defecto nadie para impuesto extra
    }

    public float aplicarDescuentoEnvio(float costoEnvioOriginal) {
        return costoEnvioOriginal; //por defecto nadie tiene dto
    }

}