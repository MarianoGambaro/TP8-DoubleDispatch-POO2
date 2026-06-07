package pt5;

public class Nuevo extends EstadoConservacion {

    @Override
    public int calcularDias(Articulo articulo) {
        return articulo.calcular(this);
    }
}
