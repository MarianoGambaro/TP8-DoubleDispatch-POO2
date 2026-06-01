package pt1;

public class Piedra extends ElementoDeJuego {
    @Override
    public boolean leGanaA(ElementoDeJuego eleccion) {
        return eleccion.pierdeContraPiedra();
    }

    @Override
    protected boolean pierdeContraTijera() {
        return false;
    }

    @Override
    protected boolean pierdeContraPapel() {
        return true;
    }

    @Override
    protected boolean pierdeContraPiedra() {
        return false;
    }

    @Override
    public String toString() {
        return "Piedra";
    }
}
