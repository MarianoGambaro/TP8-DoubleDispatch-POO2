package pt3;

public class Epica extends TipoTarea {
    @Override
    public void validarSubTarea(TipoTarea tipoTarea) {
        tipoTarea.serAceptadoPor(this);
    }

    @Override
    public boolean esTareaCompleja() {
        return true;
    }
}
