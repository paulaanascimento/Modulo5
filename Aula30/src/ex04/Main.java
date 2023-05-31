package ex04;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Tributos> tributaveis = new ArrayList<>();

        tributaveis.add(new ContaPoupanca(5000));
        tributaveis.add(new ContaCorrente(10500));
        tributaveis.add(new SeguroDeVida());

        Iterator<Tributos> iterator = tributaveis.iterator();

        while(iterator.hasNext()){
            iterator.forEachRemaining((valor) -> {
                if(valor instanceof ContaCorrente){
                    System.out.print("Tributo - Conta Corrente: ");
                }
                else if(valor instanceof ContaPoupanca){
                    System.out.print("Tributo - Conta Poupança: ");
                }
                else if(valor instanceof SeguroDeVida){
                    System.out.print("Tributo - Seguro de Vida: ");
                }
                System.out.println(valor.calcularTributos());
            });
        }

    }
}
