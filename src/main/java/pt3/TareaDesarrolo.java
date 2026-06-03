package pt3;

public class TareaDesarrolo extends TipoTarea {

    @Override
    public void validarSubTarea(TipoTarea tipoTarea) {
        throw new RuntimeException("Las tareas de desarrollo no aceptan sub tareas.");

    }

    @Override
    public boolean esTareaCompleja() {
        return false;
    }

    @Override
    public void serAceptadoPor(HistoriaUsuario historia) {
        //lo dejo pasar
    }
}
