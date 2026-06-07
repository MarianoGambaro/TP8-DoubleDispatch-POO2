package pt5;

public class Usado extends EstadoConservacion {
    @Override
    public int calcularDias(Articulo articulo) {
        return articulo.calcular(this);
    }
}
