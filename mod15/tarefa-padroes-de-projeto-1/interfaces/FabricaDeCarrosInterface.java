package interfaces;

public interface FabricaDeCarrosInterface {
    CarroDePasseioInterface criarHatch();
    CarroDePasseioInterface criarSedan();
    SUVInterface criarSUVCompacto();
    SUVInterface criarSUVGrande();
}
