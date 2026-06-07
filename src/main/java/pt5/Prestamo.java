package pt5;

import java.time.LocalDate;

public class Prestamo {

    private Articulo articulo;
    private String persona;
    private LocalDate fechaInicio;
    private LocalDate fechaDevolucion;

    public Prestamo(Articulo articulo, String persona, LocalDate fechaInicio) {
        this.articulo = articulo;
        this.persona = persona;
        this.fechaInicio = fechaInicio;

        int diasPrestamo = articulo.estado().calcularDias(articulo);
        this.fechaDevolucion = fechaInicio.plusDays(diasPrestamo);
    }

    public LocalDate fechaDevolucion() {
        return fechaDevolucion;
    }
}
