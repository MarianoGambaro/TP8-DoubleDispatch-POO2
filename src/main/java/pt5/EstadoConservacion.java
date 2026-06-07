package pt5;

public abstract class EstadoConservacion {

    public abstract int calcularDias(Articulo articulo);

    public int calculoLibro(Libro libro) {
        return (int) Math.ceil((double) libro.paginas() / 100); //para que redondee para arriba
    }

    public int calculoDisco(Disco disco) {
        return (disco.añoBanda() < 1980) ? 3 : 5;
    }

    public int calculoRevista(Revista revista) {
        int paginas = revista.cantidadPaginas();
        if (paginas < 100) return 2;
        if (paginas <= 2000) return 3;
        return 5;
    }
}
