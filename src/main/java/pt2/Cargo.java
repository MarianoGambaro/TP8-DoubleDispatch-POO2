package pt2;

public abstract class Cargo {
    public static final String VALIDA_DIRECTOR = "Como director solo mandos medios pueden estar a mi cargo";
    public static final String VALIDA_MANDOMEDIO = "Como mando medio solo juniors pueden estar a mi cargo";

    public abstract void validarSubordinado(Cargo cargoSubordinado);

    public void serAceptadoPor(Director jefe) {
        throw new RuntimeException(VALIDA_DIRECTOR);
    }

    public void serAceptadoPor(MandoMedio jefe) {
        throw new RuntimeException(VALIDA_MANDOMEDIO);
    }

    public boolean esJerarquico() {
        return false;
    }
}

//cambié mi interface Cargo por una clase abstracta para evitar tener esto en mi empleadoJerarquico:
//    if (!this.cargo.validarSubordinado(empleado.cargo())) {
//        if (this.cargo instanceof Director) throw new RuntimeException(VALIDA_DIRECTOR);
//        if (this.cargo instanceof MandoMedio) throw new RuntimeException(VALIDA_MANDOMEDIO);
//    }
//también cambie los metodos booleanos por void, ahora cada uno sabe si se puede agregar, si no, lanza exception

