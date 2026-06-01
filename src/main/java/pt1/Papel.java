package pt1;

public class Papel extends ElementoDeJuego {

    @Override
    public boolean leGanaA(ElementoDeJuego eleccion) {
        return eleccion.pierdeContraPapel();
    }

    @Override
    protected boolean pierdeContraTijera() {
        return true;
    }

    @Override
    protected boolean pierdeContraPapel() {
        return false;
    }

    @Override
    protected boolean pierdeContraPiedra() {
        return false;
    }

    @Override
    public String toString() {
        return "Papel";
    }
}
