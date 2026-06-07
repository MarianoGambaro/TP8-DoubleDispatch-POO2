package pt5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PrestamoTest {


    @Test
    public void testLibroUsadoRedondeaArriba() {
        Articulo libro = new Libro(250, new Usado());
        int dias = libro.estado().calcularDias(libro);
        assertEquals(3, dias);
    }

    @Test
    public void testDiscoDeterioradoBandaAntiguaLanzaExcepcion() {
        Articulo disco = new Disco(1979, new Deteriorado());

        assertThrows(RuntimeException.class, () -> {
            disco.estado().calcularDias(disco);
        });
    }

    @Test
    public void testDiscoDeterioradoBandaModernaRestaUnDia() {
        Articulo disco = new Disco(1985, new Deteriorado());
        int dias = disco.estado().calcularDias(disco);
        assertEquals(4, dias);
    }

    @Test
    public void testRevistaDeterioradaMayorA10Añios() {
        //pags: 150 -> Base 3 días
        //año 2010 (16 años de antiguedad en 2026) -> Resta 3 días.
        //3 - 3 = 0 -> Debe saltar el minimo de 1dia
        Articulo revista = new Revista(2010, 150, new Deteriorado());
        int dias = revista.estado().calcularDias(revista);
        assertEquals(1, dias);
    }
}