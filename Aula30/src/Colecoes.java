import java.util.*;

public class Colecoes {

    public static List<Integer> adicionarNumerosLista(){
        List<Integer> listaNumeros = new LinkedList<>();

        listaNumeros.add(1);
        listaNumeros.add(5);
        listaNumeros.add(5);
        listaNumeros.add(6);
        listaNumeros.add(7);
        listaNumeros.add(8);
        listaNumeros.add(8);
        listaNumeros.add(8);

        return listaNumeros;
    }

    public static Set<Integer> adicionarNumerosConjunto(){
        Set<Integer> conjuntoNumeros = new LinkedHashSet<>();

        conjuntoNumeros.add(1);
        conjuntoNumeros.add(5);
        conjuntoNumeros.add(5);
        conjuntoNumeros.add(6);
        conjuntoNumeros.add(7);
        conjuntoNumeros.add(8);
        conjuntoNumeros.add(8);
        conjuntoNumeros.add(8);

        return conjuntoNumeros;
    }

    public static Map<String, List<String>> criarDicionarios(){
        Map<String, List<String>> dicionario = new LinkedHashMap<>();

        List<String> listaBola = new ArrayList<>();
        List<String> listaBoneca = new ArrayList<>();
        List<String> listaDado = new ArrayList<>();
        List<String> listaCorda = new ArrayList<>();
        List<String> listaPeteca = new ArrayList<>();

        listaBola.add("azul");
        listaBoneca.add("amarela");
        listaDado.add("rosa");
        listaCorda.add("roxo");
        listaCorda.add("branco");
        listaPeteca.add("verde");
        listaPeteca.add("vermelho");
        listaPeteca.add("lilas");

        dicionario.put("bola", listaBola);
        dicionario.put("boneca", listaBoneca);
        dicionario.put("dado", listaDado);
        dicionario.put("corda", listaCorda);
        dicionario.put("peteca", listaPeteca);

        return dicionario;
    }
}
