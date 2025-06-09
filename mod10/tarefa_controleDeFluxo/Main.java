import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        Integer nota1 = scanner.nextInt();
        System.out.println("Digite a segunda nota: ");
        Integer nota2 = scanner.nextInt();
        System.out.println("Digite a terceira nota: ");
        Integer nota3 = scanner.nextInt();
        System.out.println("Digite a quarta nota: ");
        Integer nota4 = scanner.nextInt();
        String resultado = calculandoNota(nota1, nota2, nota3, nota4);
        System.out.println(resultado);
    }

    private static String calculandoNota(Integer nota1, Integer nota2, Integer nota3, Integer nota4) {
        Integer mediaNotas = (nota1 + nota2 + nota3 + nota4)/4;
        if(mediaNotas >= 7){
            return "Aprovado";
        }else if (mediaNotas >= 5){
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
