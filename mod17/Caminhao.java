public class Caminhao extends Carro {
    private double capacidadeCargaKg;

    public Caminhao(String marca, String modela, int ano, double capacidadeCargaKg) {
        super(marca, modela, ano);
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    public double getCapacidadeCargaKg() {
        return capacidadeCargaKg;
    }

    public void setCapacidadeCargaKg(double capacidadeCargaKg) {
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("--- Caminhao - Detalhes ---");
        System.out.println(super.toString());
        System.out.println("Capacidade de Carga: " + this.getCapacidadeCargaKg());
    }
}
