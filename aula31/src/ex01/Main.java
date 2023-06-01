package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> listaVerduras = new ArrayList<>();
        List<String> listaLegumes = new ArrayList<>();
        List<String> listaGraos = new ArrayList<>();
        List<String> listaOutros = new ArrayList<>();

        while(true){
            System.out.println("""
                    \nQUAL ALIMENTO DESEJA INCLUIR NA LISTA?\s
                    \t\t\t• VERDURA
                    \t\t\t• LEGUME
                    \t\t\t• GRAO
                    \t\t\t• OUTROS
                    """);

            String opcao = entrada.nextLine();

            try {
                switch (opcao.toLowerCase()){
                    case "verdura":
                        ControleListaCompras.adicionarVerdura(listaVerduras);
                        break;
                    case "legume":
                        ControleListaCompras.adicionarLegumes(listaLegumes);
                        break;
                    case "grao":
                        ControleListaCompras.adicionarGraos(listaGraos);
                        break;
                    case "outros":
                        ControleListaCompras.adicionarOutros(listaOutros);
                        break;
                    default:
                        throw new IllegalArgumentException("Tipo de alimento inválido!");
                }
                continuar(listaVerduras, listaLegumes, listaGraos, listaOutros);

            } catch (NumberFormatException erro){
                System.err.println(erro.getMessage());
            } catch (IllegalArgumentException erro2){
                System.err.println(erro2.getMessage());
            } catch (UnsupportedOperationException erro3){
                System.err.println(erro3.getMessage());
            }
        }
    }

    public static void continuar(List<String> listaVerduras, List<String> listaLegumes, List<String> listaGraos, List<String> listaOutros){
        while (true){
            System.out.println("""
                    \nDeseja adicionar outro alimento?
                    \t1 - Sim
                    \t2 - Não""");
            int opcao = entrada.nextInt();

            entrada.nextLine();

            switch (opcao){
                case 1:
                    return;
                case 2:
                    mostrarListas(listaVerduras, listaLegumes, listaGraos, listaOutros);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }

    public static void mostrarListas(List<String> listaVerduras, List<String> listaLegumes, List<String> listaGraos, List<String> listaOutros){
        System.out.println("Verduras: ");
        System.out.println(listaVerduras);
        System.out.println("\nA quantidade de alimentos do tipo verdura a ser comprada é: " + listaVerduras.size());

        System.out.println("\nLegumes: ");
        System.out.println(listaLegumes);
        System.out.println("\nA quantidade de alimentos do tipo legume a ser comprada é: " + listaLegumes.size());

        System.out.println("\nGrãos: ");
        System.out.println(listaGraos);
        System.out.println("\nA quantidade de alimentos do tipo grão a ser comprada é: " + listaGraos.size());

        System.out.println("\nOutros: ");
        System.out.println(listaOutros);
        System.out.println("\nA quantidade de alimentos do tipo outros a ser comprada é: " + listaOutros.size());
    }
}
