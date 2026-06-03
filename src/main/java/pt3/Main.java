package pt3;

public class Main {
    static void main() {

        var spike = new Tarea(2, new Spike());
        var tareaDesarrollo = new Tarea(3, new TareaDesarrolo());

        var hu = new TareaCompleja(5, new HistoriaUsuario());
        var epica = new TareaCompleja(7, new Epica());

        hu.agregarItem(tareaDesarrollo);
        System.out.println("Horas totales de historia de usuario: " + hu.horasTotales());

        epica.agregarItem(spike);
        System.out.println("Horas totales de epica: " + epica.horasTotales());
    }
}
