import java.util.Objects;

public abstract class Carro {
    private String marca;
    private String modela;
    private int ano;

    public Carro() {
    }

    public Carro(String marca, String modela, int ano) {
        this.marca = marca;
        this.modela = modela;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModela() {
        return modela;
    }

    public void setModela(String modela) {
        this.modela = modela;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return ano == carro.ano && Objects.equals(marca, carro.marca) && Objects.equals(modela, carro.modela);
    }

    public abstract void exibirDetalhes();

    @Override
    public int hashCode() {
        return Objects.hash(marca, modela, ano);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modela='" + modela + '\'' +
                ", ano=" + ano +
                '}';
    }
}
