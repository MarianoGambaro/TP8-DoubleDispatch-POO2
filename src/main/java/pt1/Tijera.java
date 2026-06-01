package pt1;

public class Tijera extends ElementoDeJuego {


    @Override
    public boolean leGanaA(ElementoDeJuego eleccion) {
        return eleccion.pierdeContraTijera();
    }

    @Override
    protected boolean pierdeContraTijera() {
        return false;
    }

    @Override
    protected boolean pierdeContraPapel() {
        return false;
    }

    @Override
    protected boolean pierdeContraPiedra() {
        return true;
    }

    @Override
    public String toString() {
        return "Tijera";
    }
}
