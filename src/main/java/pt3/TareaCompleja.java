package pt3;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja implements ItemDeProyecto {
    public static final String VALIDA_TAREA_COMPLEJA = "No puede crear TS o Spike como Tarea Compleja";
    private List<ItemDeProyecto> items = new ArrayList<>();
    private int horasEstimadas;
    private TipoTarea tipoTarea;

    public TareaCompleja(int horasEstimadas, TipoTarea tipoTarea) {
        if (!tipoTarea.esTareaCompleja()) {
            throw new RuntimeException(VALIDA_TAREA_COMPLEJA);
        }
        this.horasEstimadas = horasEstimadas;
        this.tipoTarea = tipoTarea;
    }

    public void agregarItem(ItemDeProyecto item) {
        this.tipoTarea.validarSubTarea(item.tipoTarea());
        this.items.add(item);
    }


    @Override
    public int horasTotales() {
        int horasTotales = this.horasEstimadas;
        for (ItemDeProyecto item : items) {
            horasTotales += item.horasTotales();
        }
        return horasTotales;
    }

    @Override
    public TipoTarea tipoTarea() {
        return this.tipoTarea;
    }
}
