import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaisesOrdenados {
    public static void main(String[] args) {
        List<String> paises = new ArrayList<>();
        paises.add("Brasil");
        paises.add("Argentina");
        paises.add("Uruguai");
        paises.add("Espanha");
        paises.add("França");
        paises.add("Itália");
        paises.add("Alemanha");
        paises.add("Portugal");
        paises.add("Chile");

        System.out.println("Ordem original:");
        for (String pais : paises) {
            System.out.println(pais);
        }

        Collections.sort(paises);

        System.out.println("\nOrdem alfabética:");
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
}
