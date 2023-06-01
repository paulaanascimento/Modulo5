package ex01;

import java.util.List;
import java.util.Scanner;

public class ControleListaCompras {

    static Scanner entrada = new Scanner(System.in);

    public static void adicionarVerdura(List<String> listaVerduras){
        double quantidade;

        do {
           System.out.print("Informe a quantidade em gramas: ");
           String aux = entrada.nextLine();

           if(aux.isBlank()){
               throw new UnsupportedOperationException("Não é permitido inserir valor vazio\n");
           }

            if(!aux.contains(".")){
                throw new NumberFormatException("Para verdura, a quantidade deve ser informada com ponto\n");
            }

           quantidade = Double.parseDouble(aux);

           if(quantidade < 0){
               System.out.println("Não é possível inserir números negativos. Por favor, tente novamente");
           }
       }while (quantidade < 0);

        System.out.print("Informe o nome do alimento que será comprado: ");
        String alimento = entrada.nextLine();

        if(alimento.isBlank()){
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio");
        }

        listaVerduras.add(alimento + " - " + quantidade + " kg");
    }

    public static void adicionarGraos(List<String> listaGraos){
        double quantidade;

        do{
            System.out.print("Informe a quantidade em gramas: ");
            String aux = entrada.nextLine();

            if(aux.isBlank()){
                throw new UnsupportedOperationException("Não é permitido inserir valor vazio\n");
            }

            if(!aux.contains(".")){
                throw new NumberFormatException("Para grãos, a quantidade deve ser informada com ponto\n");
            }

            quantidade = Double.parseDouble(aux);

            if(quantidade < 0){
                System.out.println("Não é possível inserir números negativos. Por favor, tente novamente");
            }
        }while (quantidade < 0);

        System.out.print("Informe o nome do alimento que será comprado: ");
        String alimento = entrada.nextLine();

        if(alimento.isBlank()){
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio");
        }

        listaGraos.add(alimento + " - " + quantidade + " kg");
    }

    public static void adicionarLegumes(List<String> listaLegumes){
        int quantidade;

        do{
            System.out.print("Informe a quantidade em unidades: ");
            String aux = entrada.nextLine();

            if(aux.isBlank()){
                throw new UnsupportedOperationException("Não é permitido inserir valor vazio\n");
            }

            if(aux.contains(".")){
                throw new NumberFormatException("Para legume, a quantidade deve ser informada em unidades inteiras\n");
            }

            quantidade = Integer.parseInt(aux);

            if(quantidade < 0){
                System.out.println("Não é possível inserir números negativos. Por favor, tente novamente");
            }
        }while (quantidade < 0);

        System.out.print("Informe o nome do alimento que será comprado: ");
        String alimento = entrada.nextLine();

        if(alimento.isBlank()){
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio");
        }

        listaLegumes.add(alimento + " - " + quantidade + " unidades");
    }

    public static void adicionarOutros(List<String> listaOutros){
        int quantidade;

        do{
            System.out.print("Informe a quantidade em unidades: ");
            String aux = entrada.nextLine();

            if(aux.isBlank()){
                throw new UnsupportedOperationException("Não é permitido inserir valor vazio\n");
            }

            if(aux.contains(".")){
                throw new NumberFormatException("Para outros, a quantidade deve ser informada em unidades inteiras\n");
            }

            quantidade = Integer.parseInt(aux);

            if(quantidade < 0){
                System.out.println("Não é possível inserir números negativos. Por favor, tente novamente");
            }
        }while (quantidade < 0);

        System.out.print("Informe o nome do alimento que será comprado: ");
        String alimento = entrada.nextLine();

        if(alimento.isBlank()){
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio");
        }

        listaOutros.add(alimento + " - " + quantidade + " unidades");
    }
}
