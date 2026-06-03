package pt3;

public abstract class TipoTarea {
//    TAREA_DESARROLLO,
//    SPIKE,
//    HISTORIA_USUARIO,
//    EPICA;

    public static final String VALIDA_HISTORIA = "Solo tareas de desarrollo se permiten en una historia de usuario";
    public static final String VALIDA_EPICA = "Solo spikes se permiten en una epica";


    public abstract void validarSubTarea(TipoTarea tipoTarea);

    public abstract boolean esTareaCompleja();

    public void serAceptadoPor(HistoriaUsuario historia) {
        throw new RuntimeException(VALIDA_HISTORIA);
    }

    public void serAceptadoPor(Epica epica) {
        throw new RuntimeException(VALIDA_EPICA);
    }


}
