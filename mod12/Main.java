import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> grupos = new HashMap<>();
        grupos.put("M", new ArrayList<>());
        grupos.put("F", new ArrayList<>());
        grupos.put("N", new ArrayList<>());

        while (true) {
            System.out.print("Digite o nome do usuário (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            String sexo;
            while (true) {
                System.out.print("Digite o sexo (M para masculino, F para feminino, N para não binário): ");
                sexo = scanner.nextLine().toUpperCase();
                if (sexo.equals("M") || sexo.equals("F") || sexo.equals("N")) {
                    break;
                } else {
                    System.out.println("Entrada inválida. Por favor, use M, F ou N.");
                }
            }

            String nomeComGenero = nome + " - " + sexo;
            grupos.get(sexo).add(nomeComGenero);

            System.out.println("\nUsuário adicionado com sucesso!");
            System.out.println("---------------------------------");
        }

        System.out.println("\n--- Listas de Usuários por Gênero ---");
        System.out.println("Masculino: " + grupos.get("M"));
        System.out.println("Feminino: " + grupos.get("F"));
        System.out.println("Não Binário: " + grupos.get("N"));

        scanner.close();
    }
}
