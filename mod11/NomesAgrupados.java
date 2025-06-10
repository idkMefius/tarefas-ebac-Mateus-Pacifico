import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NomesAgrupados {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Lucas-M");
        nomes.add("Ana-F");
        nomes.add("Bruno-M");
        nomes.add("Carla-F");
        nomes.add("Eduardo-M");
        nomes.add("Fernanda-F");
        nomes.add("João-M");
        nomes.add("Isabela-F");
        nomes.add("Miguel-M");
        nomes.add("Renata-F");
        nomes.add("Alex-N");
        nomes.add("Sasha-N");
        nomes.add("Gabriel-M");
        nomes.add("Beatriz-F");
        nomes.add("Thiago-M");
        nomes.add("Mariana-F");
        nomes.add("Cássio-M");
        nomes.add("Patrícia-F");
        nomes.add("Taylor-N");
        nomes.add("Jordan-N");

        Collections.sort(nomes, (n1, n2) -> {
            String nome1 = n1.split("-")[0];
            String nome2 = n2.split("-")[0];
            return nome1.compareToIgnoreCase(nome2);
        });

        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();
        List<String> naoBinarios = new ArrayList<>();
        for (String nome : nomes) {
            String[] parts = nome.split("-");
            if (parts[1].equals("M")) {
                masculinos.add(nome);
            } else if (parts[1].equals("F")) {
                femininos.add(nome);
            } else {
                naoBinarios.add(nome);
            }
        }

        System.out.println("== Nomes Masculinos ==");
        masculinos.forEach(System.out::println);

        System.out.println("\n== Nomes Femininos ==");
        femininos.forEach(System.out::println);

        System.out.println("\n== Nomes Não Binários ==");
        naoBinarios.forEach(System.out::println);
    }
}
