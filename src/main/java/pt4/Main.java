package pt4;

public class Main {
    static void main() {


        var cliente = new Cliente("Jose", new ClienteCorporativo());
        var producto = new ServicioDigital("Hosting", 100, 0.10f);
        var carrito = new CarritoCompras(cliente);

        carrito.agregarProducto(producto);
        System.out.println(carrito.calcularPrecio());

        var cliente2 = new Cliente("Jose", new ClienteCorporativo());
        var producto2 = new ProductoFisico("Libro", 100, 15);
        var carrito2 = new CarritoCompras(cliente2);

        carrito2.agregarProducto(producto2);
        System.out.println(carrito2.calcularPrecio());
    }
}
