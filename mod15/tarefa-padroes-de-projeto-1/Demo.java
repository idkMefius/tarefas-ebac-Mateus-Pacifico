import factory.FabricaDeCarros;
import interfaces.CarroDePasseioInterface;
import interfaces.FabricaDeCarrosInterface;
import interfaces.SUVInterface;

public class Demo {
    public static void main(String[] args) {
        FabricaDeCarrosInterface fabricaDeCarros = new FabricaDeCarros();
        System.out.println("--- CRIANDO CARROS COM A FÁBRICA DE CARROS DE PASSEIO ---");
        CarroDePasseioInterface carroPasseioSedan = fabricaDeCarros.criarSedan();
        carroPasseioSedan.exibirInfoCarroDePasseio();
        CarroDePasseioInterface carroPasseioHatch = fabricaDeCarros.criarHatch();
        carroPasseioHatch.exibirInfoCarroDePasseio();

        System.out.println("\n--- CRIANDO CARROS COM A FÁBRICA DE CARROS DE SUV ---");
        SUVInterface carroSUVCompacto = fabricaDeCarros.criarSUVCompacto();
        carroSUVCompacto.exibirInfoSUV();
        SUVInterface carroSUVGrande = fabricaDeCarros.criarSUVGrande();
        carroSUVGrande.exibirInfoSUV();
    }
}
