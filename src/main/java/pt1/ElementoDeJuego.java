package pt1;

public abstract class ElementoDeJuego {

    public abstract boolean leGanaA(ElementoDeJuego eleccion);

    protected abstract boolean pierdeContraTijera();

    protected abstract boolean pierdeContraPapel();

    protected abstract boolean pierdeContraPiedra();

    public boolean hayEmpate(ElementoDeJuego elementoDeJuego) {
        return this.getClass().equals(elementoDeJuego.getClass());
    }
}
