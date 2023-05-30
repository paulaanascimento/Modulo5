import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaNumeros = Colecoes.adicionarNumerosLista();
        System.out.println("----- LISTA -----");
        System.out.println(listaNumeros);

        Set<Integer> conjuntoNumeros = Colecoes.adicionarNumerosConjunto();
        System.out.println("\n----- CONJUNTO -----");
        System.out.println(conjuntoNumeros);
        // a diferença é que o conjunto não aceita valores duplicados, logo só armazenará o elemento uma vez

        Map<String, List<String>> dicionario = Colecoes.criarDicionarios();
        System.out.println("\n----- MAP -----");
        for (Map.Entry<String, List<String>> valor : dicionario.entrySet()) {
            System.out.println("Objeto: " + valor.getKey() + " | Cores: " + valor.getValue());
        }
    }
}
