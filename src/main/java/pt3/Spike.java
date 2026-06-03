package pt3;

public class Spike extends TipoTarea {


    @Override
    public void validarSubTarea(TipoTarea tipoTarea) {
        throw new RuntimeException("Las spikes no aceptan sub tareas.");
    }

    @Override
    public boolean esTareaCompleja() {
        return false;
    }

    @Override
    public void serAceptadoPor(Epica epica) {
        //la dejo pasar
    }
}
