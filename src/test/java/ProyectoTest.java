import org.junit.jupiter.api.Test;
import pt3.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProyectoTest {

    @Test
    public void historiaNoPuedeContenerAHistoria() {
        var tareaCompleja = new TareaCompleja(10, new HistoriaUsuario());
        var tareaCompleja2 = new TareaCompleja(20, new HistoriaUsuario());
        var e = assertThrows(RuntimeException.class, () -> {
            tareaCompleja.agregarItem(tareaCompleja2);
        });

        assertEquals(TipoTarea.VALIDA_HISTORIA, e.getMessage());
    }

    @Test
    public void historiaNoPuedeContenerASpike() {
        var tareaCompleja = new TareaCompleja(10, new HistoriaUsuario());
        var spike = new Tarea(20, new Spike());
        var e = assertThrows(RuntimeException.class, () -> {
            tareaCompleja.agregarItem(spike);
        });
        assertEquals(TipoTarea.VALIDA_HISTORIA, e.getMessage());
    }

    @Test
    public void epicaNoPuedeContenerTareaDesarrollo() {
        var tareaCompleja = new TareaCompleja(10, new Epica());
        var td = new Tarea(20, new TareaDesarrolo());
        var e = assertThrows(RuntimeException.class, () -> {
            tareaCompleja.agregarItem(td);
        });
        assertEquals(TipoTarea.VALIDA_EPICA, e.getMessage());
    }

    @Test
    public void noPuedoCrearUnaEpicaComoTareaSimple() {
        var e = assertThrows(RuntimeException.class, () -> {
            new Tarea(20, new Epica());
        });
        assertEquals(Tarea.VALIDA_TAREA_SIMPLE, e.getMessage());
    }

    @Test
    public void noPuedoCrearUnaHSComoTareaSimple() {
        var e = assertThrows(RuntimeException.class, () -> {
            new Tarea(20, new HistoriaUsuario());
        });
        assertEquals(Tarea.VALIDA_TAREA_SIMPLE, e.getMessage());
    }

    @Test
    public void noPuedoCrearUnSpikeComoTareaCompleja() {
        var e = assertThrows(RuntimeException.class, () -> {
            new TareaCompleja(20, new Spike());
        });
        assertEquals(TareaCompleja.VALIDA_TAREA_COMPLEJA, e.getMessage());
    }

    //hacen falta mas tests...
    @Test
    public void noPuedoCrearUnaTareaDesarrolloComoTareaCompleja() {
        var e = assertThrows(RuntimeException.class, () -> {
            new TareaCompleja(10, new TareaDesarrolo());
        });
        assertEquals(TareaCompleja.VALIDA_TAREA_COMPLEJA, e.getMessage());
    }

    @Test
    public void EpicasConSpikesDentro() {
        //setup
        var spike = new Tarea(2, new Spike());
        var spike2 = new Tarea(2, new Spike());
        var epica = new TareaCompleja(7, new Epica());
        //ejec
        epica.agregarItem(spike);
        epica.agregarItem(spike2);
        //verif
        assertEquals(11, epica.horasTotales());
    }

    @Test
    public void HUConTareasDeDesarrolloDentro() {
        //ssetup
        var tareaDesarrollo = new Tarea(3, new TareaDesarrolo());
        var tareaDesarrollo2 = new Tarea(3, new TareaDesarrolo());
        var hu = new TareaCompleja(5, new HistoriaUsuario());
        //ejec
        hu.agregarItem(tareaDesarrollo);
        hu.agregarItem(tareaDesarrollo2);
        //verif
        assertEquals(11, hu.horasTotales());
    }

    @Test
    public void noSePuedeAgregarSpikeAHU() {
        var hu = new TareaCompleja(6, new HistoriaUsuario());
        var spike = new Tarea(2, new Spike());
        //ejec

        var e = assertThrows(RuntimeException.class, () -> {
            hu.agregarItem(spike);
        });
        assertEquals(TipoTarea.VALIDA_HISTORIA, e.getMessage());
    }

    @Test
    public void noSePuedeAgregarTareaDeDesarrolloAEpica() {
        var epica = new TareaCompleja(6, new Epica());
        var tareaDesarrollo = new Tarea(2, new TareaDesarrolo());
        //ejec
        var e = assertThrows(RuntimeException.class, () -> {
            epica.agregarItem(tareaDesarrollo);
        });
        assertEquals(TipoTarea.VALIDA_EPICA, e.getMessage());
    }
}
