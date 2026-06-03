package pt2;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoJerarquico implements Empleado {
    public static final String VALIDA_EMPLADO_JERARQUICO = "Solo directores o mandos medios son empleados jerarquicos";
    private final String nombre;
    private List<Empleado> empleados;
    private double salario;
    private Cargo cargo;

    public EmpleadoJerarquico(String nombre, double salario, Cargo cargo) {
        if (!cargo.esJerarquico()) {
            throw new RuntimeException(VALIDA_EMPLADO_JERARQUICO);
        }
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        cargo.validarSubordinado(empleado.cargo());
        this.empleados.add(empleado);
    }

    @Override
    public double calcularSalario() {
        double total = this.salario;
        for (Empleado m : empleados) {
            total += m.calcularSalario();
        }
        return total;
    }

    @Override
    public Cargo cargo() {
        return this.cargo;
    }

    public boolean tieneDeEmpleadoA(Empleado empleado) {
        return this.empleados.contains(empleado);
    }
}
