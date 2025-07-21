import br.com.mefius.easysheet.Pessoa;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeparadorGruposTest {
    @Test
    @DisplayName("Deve retornar uma lista contendo apenas pessoas do gênero feminino")
    void quandoFiltrarListaMistaEntaoRetornarApenasMulheres() {
        System.out.println("Preparando dados do teste...");
        List<Pessoa> listaOriginal = new ArrayList<>();
        listaOriginal.add(new Pessoa("João Silva", "Masculino"));
        listaOriginal.add(new Pessoa("Maria Oliveira", "Feminino"));
        listaOriginal.add(new Pessoa("Carlos Pereira", "Masculino"));
        listaOriginal.add(new Pessoa("Ana Costa", "feminino"));

        System.out.println("Executando a lógica de filtro...");
        List<Pessoa> listaFiltrada = listaOriginal.stream()
                .filter(pessoa -> pessoa.getGenero().equalsIgnoreCase("Feminino"))
                .toList();

        System.out.println("Verificando os resultados...");

        assertEquals(2, listaFiltrada.size(), "A lista filtrada deveria ter exatamente 2 pessoas.");

        boolean todasSaoMulheres = listaFiltrada.stream()
                .allMatch(pessoa -> pessoa.getGenero().equalsIgnoreCase("Feminino"));

        assertTrue(todasSaoMulheres, "Nem todas as pessoas na lista resultante são do gênero feminino.");

        System.out.println("Teste concluído com sucesso!");
    }

    @Test
    @DisplayName("Deve retornar uma lista vazia se não houver mulheres")
    void quandoFiltrarListaSemMulheres_entaoDeveRetornarListaVazia() {

        List<Pessoa> listaOriginal = new ArrayList<>();
        listaOriginal.add(new Pessoa("Pedro", "Masculino"));
        listaOriginal.add(new Pessoa("Marcos", "Masculino"));

        List<Pessoa> listaFiltrada = listaOriginal.stream()
                .filter(p -> p.getGenero().equalsIgnoreCase("Feminino"))
                .toList();

        assertTrue(listaFiltrada.isEmpty(), "A lista deveria estar vazia, mas contém elementos.");
    }
}
