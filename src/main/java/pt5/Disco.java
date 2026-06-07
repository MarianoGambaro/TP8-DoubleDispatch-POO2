package pt5;

public class Disco implements Articulo {

    private int añoBanda;
    private EstadoConservacion estado;

    public Disco(int añoBanda, EstadoConservacion estado) {
        this.añoBanda = añoBanda;
        this.estado = estado;
    }

    public int añoBanda() {
        return añoBanda;
    }

    @Override
    public int calcular(EstadoConservacion estado) {
        return estado.calculoDisco(this);
    }

    @Override
    public EstadoConservacion estado() {
        return this.estado;
    }
}
