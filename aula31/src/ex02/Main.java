package ex02;

import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            System.out.println("\n----- BOAS VINDAS AO CONVERSOR DE MOEDAS -----");
            System.out.println("""
                    Qual das opções de moeda abaixo deseja converter?
                    \t1 - Dolar Americano
                    \t2 - Dolar Canadense
                    \t3 - Euro
                    \t4 - Libra Esterlina""");

            int opcao = entrada.nextInt();

            try {
                switch (opcao){
                    case 1:
                        ConversaoMoedas.converterDolarAmericano();
                        break;
                    case 2:
                        ConversaoMoedas.converterDolarCanadense();
                        break;
                    case 3:
                        ConversaoMoedas.converterEuro();
                        break;
                    case 4:
                        ConversaoMoedas.converterLibraEsterlina();
                        break;
                    default:
                        throw new IllegalArgumentException("Tipo de moeda inválido!");
                }

                continuar();
            } catch (NumberFormatException erro){
                System.err.println(erro.getMessage());
            } catch (IllegalArgumentException erro2){
                System.err.println(erro2.getMessage());
            }
        }
    }

    public static void continuar(){
        while (true){
            System.out.println("""
                    \nDeseja fazer outra conversão?
                    \t1 - Sim
                    \t2 - Não""");
            int opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    return;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }
}
