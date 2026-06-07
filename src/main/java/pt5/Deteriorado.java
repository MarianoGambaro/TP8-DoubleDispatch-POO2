package pt5;

import java.time.LocalDate;

public class Deteriorado extends EstadoConservacion {


    @Override
    public int calcularDias(Articulo articulo) {
        return articulo.calcular(this);
    }

    @Override
    public int calculoDisco(Disco disco) {
        if (disco.añoBanda() < 1980) {
            throw new RuntimeException("El disco esta deteriorado y es anterior a 1980. No se puede prestar.");
        }
        int diasNormales = super.calculoDisco(disco);
        return Math.max(1, diasNormales - 1);
    }

    @Override
    public int calculoRevista(Revista revista) {
        int añosAntiguedad = (LocalDate.now().getYear()) - revista.añoPublicacion();
        int diasBase = super.calculoRevista(revista);

        System.out.println("DEBUG -> Antigüedad: " + añosAntiguedad + " | Dias Base: " + diasBase);

        int diasFinales = (añosAntiguedad > 10) ? (diasBase - 3) : (diasBase - 1);
        return Math.max(1, diasFinales);
    }
}
