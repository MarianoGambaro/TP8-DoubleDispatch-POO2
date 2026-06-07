package pt5;

public class Libro implements Articulo {

    private int paginas;
    private EstadoConservacion estado;

    public Libro(int paginas, EstadoConservacion estado) {
        this.paginas = paginas;
        this.estado = estado;
    }

    public int paginas() {
        return paginas;
    }

    @Override
    public int calcular(EstadoConservacion estado) {
        return estado.calculoLibro(this);
    }

    @Override
    public EstadoConservacion estado() {
        return this.estado;
    }
}
