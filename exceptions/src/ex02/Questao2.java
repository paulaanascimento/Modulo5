package ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir");

        boolean continua;
        int x = 0, y = 0;

        do {
            try {
                System.out.print("Informe o primeiro valor: ");
                x = teclado.nextInt();
                continua = false;
            } catch (InputMismatchException erro){
                System.out.println("Erro: É necessário informar um número inteiro");
                continua = true;
                teclado.nextLine();
            }
        }while (continua);

        do {
            try {
                System.out.print("Informe o segundo valor: ");
                y = teclado.nextInt();

                if(y == 0){
                    throw new ArithmeticException("Não é possivel dividir por 0");
                }
                continua = false;
            } catch (InputMismatchException erro){
                System.out.println("Erro: É necessário informar um número inteiro");
                continua = true;
                teclado.nextLine();
            } catch (ArithmeticException erro){
                System.out.println("Erro: " + erro.getMessage());
                continua = true;
                teclado.nextLine();
            }
        }while (continua);


        double r = ((double) x /y);
        System.out.println("O resultado da divisão é " + r);
    }
}
