package ex01;

public class TesteException {
    public static void main(String[] args) {
        System.out.println("inicio do main");
        metodo1();
        System.out.println("fim do main");
    }

    static void metodo1(){
        System.out.println("inicio do metodo1");
        metodo2();
        System.out.println("fim do metodo1");
    }

    static void metodo2(){
        System.out.println("inicio do metodo2");
        int[] array = new int[10];

        try {
            for(int i = 0; i <= 15; i++){
                array[i] = i;
                System.out.println(i);
            }
        }catch (ArrayIndexOutOfBoundsException erro){
            System.out.println("\nErro: O índice é maior que o comprimento do vetor\n");
        }
        System.out.println("fim do metodo2");
    }
}
