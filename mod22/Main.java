import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> todasPessoas = new ArrayList<>();

        System.out.println("--- Cadastro de Pessoas ---");
        System.out.println("Digite o nome e o gênero de cada pessoa.");
        System.out.println("Para encerrar, digite 'sair' no campo do nome.");
        System.out.println("----------------------------------------------");

        while (true) {
            System.out.println("\nDigite o nome: ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                System.out.println("Obrigado por usar nosso programa!");
                break;
            }

            System.out.println("\nDigite o gênero (F para feminino e M para masculino): ");
            String genero = scanner.nextLine();
            if (genero.equalsIgnoreCase("F") || genero.equalsIgnoreCase("M")) {
                todasPessoas.add(new Pessoa(nome, genero));
            } else {
                System.out.println("Digite apenas F ou M.");
            }
        }

        List<Pessoa> listaMulheres = todasPessoas.stream().filter(pessoa -> pessoa.getGenero().equalsIgnoreCase("F")).toList();
        System.out.println("\n--- Lista de mulheres ---");
        if (listaMulheres.isEmpty()) {
            System.out.println("Nenhuma pessoa do sexo feminino foi encontrada na lista.");
        } else {
            listaMulheres.forEach(mulher -> System.out.println(mulher.getNome()));
        }

        scanner.close();
    }
}
