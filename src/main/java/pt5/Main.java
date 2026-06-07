package pt5;

import java.time.LocalDate;

public class Main {
    static void main() {

        var libro = new Libro(200, new Deteriorado());

        var prestamo = new Prestamo(libro, "Juan", LocalDate.now());

        System.out.println(prestamo.fechaDevolucion());
    }
}
