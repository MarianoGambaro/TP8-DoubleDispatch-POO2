package pt5;

public class Revista implements Articulo {

    private int añoPublicacion;
    private int cantidadPaginas;
    private EstadoConservacion estado;

    public Revista(int añoPublicacion, int cantidadPaginas, EstadoConservacion estado) {
        this.añoPublicacion = añoPublicacion;
        this.cantidadPaginas = cantidadPaginas;
        this.estado = estado;
    }

    public int añoPublicacion() {
        return añoPublicacion;
    }

    public int cantidadPaginas() {
        return cantidadPaginas;
    }

    @Override
    public int calcular(EstadoConservacion estado) {
        return estado.calculoRevista(this);
    }

    @Override
    public EstadoConservacion estado() {
        return this.estado;
    }
}
