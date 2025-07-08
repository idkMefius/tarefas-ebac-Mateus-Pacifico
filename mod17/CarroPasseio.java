public class CarroPasseio extends Carro{
    private int numPortas;

    public CarroPasseio(String marca, String modela, int ano, int numPortas) {
        super(marca, modela, ano);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("--- Carro de Passeio - Detalhes ---");
        System.out.println(super.toString());
        System.out.println("Numero de Portas: " + this.getNumPortas());
    }
}
