package pt4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarritoComprasTest {

    @Test
    public void testClienteRegular() {
        var cliente = new Cliente("Jose", new ClienteRegular());
        var producto1 = new ServicioDigital("Hosting", 100, 0.10f);
        var producto2 = new ProductoFisico("Libro", 100, 15);
        var carrito = new CarritoCompras(cliente);
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        assertEquals(1731.0F, carrito.calcularPrecio());
    }

    @Test
    public void testClienteCorportivo() {
        var cliente = new Cliente("Jose", new ClienteCorporativo());
        var producto1 = new ServicioDigital("Hosting", 100, 0.10f);
        var producto2 = new ProductoFisico("Libro", 100, 15);
        var carrito = new CarritoCompras(cliente);
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        assertEquals(971.0F, carrito.calcularPrecio());
    }

    //hice estos dos test porque no me daban bien los resultados:

    @Test
    public void testAislarServicioDigitalCorporativo() {
        // Hosting: Precio 100. Corporativo no debería pagar impuesto extra. Total = 100.
        var cliente = new Cliente("Jose", new ClienteCorporativo());
        var producto = new ServicioDigital("Hosting", 100, 0.10f);
        var carrito = new CarritoCompras(cliente);

        carrito.agregarProducto(producto);
        assertEquals(100.0F, carrito.calcularPrecio());
    }

    @Test
    public void testAislarProductoFisicoCorporativo() {
        //Total esperado: 100 + 21 + 750 = 871.
        var cliente = new Cliente("Jose", new ClienteCorporativo());
        var producto = new ProductoFisico("Libro", 100, 15);
        var carrito = new CarritoCompras(cliente);

        carrito.agregarProducto(producto);

        assertEquals(871.0F, carrito.calcularPrecio());
    }
}