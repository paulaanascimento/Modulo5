package ex02;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConversaoMoedas {

    private static Scanner entrada = new Scanner(System.in);

    public static void converterDolarAmericano(){
        System.out.println("Esse programa apenas converte para Real(R$)\n");
        System.out.print("Digite, em dolar americano, o valor que deseja converter: ");
        String aux = entrada.nextLine();

        if(!aux.matches("-?\\d+(\\.\\d+)?")){
            throw new NumberFormatException("Para moeda, o valor monetário deve ser um número decimal\n");
        }

        BigDecimal valorParaConversao = new BigDecimal(aux);

        if(valorParaConversao.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Valor inválido, por favor, tente novamente\n");
        }

        BigDecimal valorConvertido = valorParaConversao.multiply(BigDecimal.valueOf(5.25));

        System.out.println("\nO dolar americano na cotação de hoje " + ConversaoMoedas.dataAtual() + " está em R$5.25, o valor que pediu para converter de US$" + valorParaConversao + " em reais é R$" + valorConvertido);
    }

    public static void converterDolarCanadense(){
        System.out.println("Esse programa apenas converte para Real(R$)\n");
        System.out.print("Digite, em dolar canadense, o valor que deseja converter: ");
        String aux = entrada.nextLine();

        if(!aux.matches("-?\\d+(\\.\\d+)?")){
            throw new NumberFormatException("Para moeda, o valor monetário deve ser um número decimal\n");
        }

        BigDecimal valorParaConversao = new BigDecimal(aux);

        if(valorParaConversao.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Valor inválido, por favor, tente novamente\n");
        }

        BigDecimal valorConvertido = valorParaConversao.multiply(BigDecimal.valueOf(4.15));

        System.out.println("\nO dolar canadense na cotação de hoje " + ConversaoMoedas.dataAtual() + " está em R$4.15, o valor que pediu para converter de C$" + valorParaConversao + " em reais é R$" + valorConvertido);
    }

    public static void converterEuro(){
        System.out.println("Esse programa apenas converte para Real(R$)\n");
        System.out.print("Digite, em euro, o valor que deseja converter: ");
        String aux = entrada.nextLine();

        if(!aux.matches("-?\\d+(\\.\\d+)?")){
            throw new NumberFormatException("Para moeda, o valor monetário deve ser um número decimal\n");
        }

        BigDecimal valorParaConversao = new BigDecimal(aux);

        if(valorParaConversao.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Valor inválido, por favor, tente novamente\n");
        }

        BigDecimal valorConvertido = valorParaConversao.multiply(BigDecimal.valueOf(6.15));

        System.out.println("\nO euro na cotação de hoje " + ConversaoMoedas.dataAtual() + " está em R$6.15, o valor que pediu para converter de " + valorParaConversao + "€ em reais é R$" + valorConvertido);
    }

    public static void converterLibraEsterlina(){
        System.out.println("Esse programa apenas converte para Real(R$)\n");
        System.out.print("Digite, em libra esterlina, o valor que deseja converter: ");
        String aux = entrada.nextLine();

        if(!aux.matches("-?\\d+(\\.\\d+)?")){
            throw new NumberFormatException("Para moeda, o valor monetário deve ser um número decimal\n");
        }

        BigDecimal valorParaConversao = new BigDecimal(aux);

        if(valorParaConversao.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Valor inválido, por favor, tente novamente\n");
        }

        BigDecimal valorConvertido = valorParaConversao.multiply(BigDecimal.valueOf(7.50));

        System.out.println("\nA libra esterlina na cotação de hoje " + ConversaoMoedas.dataAtual() + " está em R$7.50, o valor que pediu para converter de £" + valorParaConversao + " em reais é R$" + valorConvertido);
    }

    private static String dataAtual(){
        LocalDate data = LocalDate.now();
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyy");
        return data.format(dataFormatada);
    }
}
