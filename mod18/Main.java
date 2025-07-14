public class Main {
    public static void main(String[] args) {
        Class<Produto> classeProduto = Produto.class;

        if (classeProduto.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = classeProduto.getAnnotation(Tabela.class);
            String nomeTabela = tabela.value();
            System.out.println("Leitura da anotação @Tabela:");
            System.out.println("A classe '" + classeProduto.getSimpleName() + "' está mapeada para a tabela: '" + nomeTabela + "'.");
        } else {
            System.out.println("A anotação @Tabela não foi encontrada na classe '" + classeProduto.getSimpleName() + "'.");
        }
    }
}
