import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    public static void main(String[] args) {
        List<Carro> frota = new ArrayList<>();

        frota.add(new CarroPasseio("Fiat", "Cronos", 2023, 4));
        frota.add(new CarroPasseio("Toyota", "Hilux", 2024, 6));
        frota.add(new Caminhao("Volvo", "FH 540", 2022, 40000.0));
        frota.add(new Caminhao("Mercedes-Benz", "Actros 2651", 2023, 50000.0));

        System.out.println("--- Frota da Concessionária ---");
        for (Carro carro : frota) {
            carro.exibirDetalhes();
            System.out.println("--------------------------------------------------------------");
        }
    }
}
