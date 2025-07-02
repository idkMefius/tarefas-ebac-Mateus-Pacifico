package factory;

import interfaces.CarroDePasseioInterface;
import interfaces.FabricaDeCarrosInterface;
import interfaces.SUVInterface;
import model.Hatch;
import model.SUVCompacto;
import model.SUVGrande;
import model.Sedan;

public class FabricaDeCarros implements FabricaDeCarrosInterface {
    @Override
    public CarroDePasseioInterface criarSedan() {
        return new Sedan();
    }

    @Override
    public CarroDePasseioInterface criarHatch() {
        return new Hatch();
    }

    @Override
    public SUVInterface criarSUVCompacto() {
        return new SUVCompacto();
    }

    @Override
    public SUVInterface criarSUVGrande() {
        return new SUVGrande();
    }
}
