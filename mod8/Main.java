public class Main {
    public static void main(String[] args) {
        Float number1 = (float)(Math.random() * 10);
        Float number2 = (float)(Math.random() * 10);
        Float number3 = (float)(Math.random() * 10);
        Float number4 = (float)(Math.random() * 10);
        float result = ((number1 + number2 + number3 + number4)/4);
        System.out.printf("Notas:\n %.2f%n %.2f%n %.2f%n %.2f%n", number1, number2, number3, number4);
        System.out.printf("Média: %.2f%n", result);
        if (result >= 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
