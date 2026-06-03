package pt2;

public class EmpleadoRegular extends Cargo implements Empleado {

    private String nombre;
    private double salario;

    public EmpleadoRegular(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return this.salario;
    }

    @Override
    public Cargo cargo() {
        return new EmpleadoRegular(this.nombre, this.salario);
    }

    @Override
    public void serAceptadoPor(MandoMedio jefe) {

    }

    @Override
    public void validarSubordinado(Cargo cargoSubordinado) {
        throw new RuntimeException("Un empleado regular no puede tener gente a su cargo");
    }
}