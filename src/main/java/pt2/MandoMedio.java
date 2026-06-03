package pt2;

public class MandoMedio extends Cargo {

    @Override
    public void validarSubordinado(Cargo cargoSubordinado) {
        cargoSubordinado.serAceptadoPor(this);
    }

    public void serAceptadoPor(Director jefe) {
        //lo dejo pasar
    }

    @Override
    public boolean esJerarquico() {
        return true;
    }
}
