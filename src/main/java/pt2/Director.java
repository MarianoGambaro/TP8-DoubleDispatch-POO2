package pt2;

public class Director extends Cargo {

    @Override
    public void validarSubordinado(Cargo cargoSubordinado) {
        cargoSubordinado.serAceptadoPor(this);
    }

    @Override
    public boolean esJerarquico() {
        return true;
    }
}
