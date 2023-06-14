package ex02;

public class CalcularDiasSemana {

    public String diaDaSemana(int dia){
        String diaSemana;
        boolean eOMelhorDiaParaIrAFeira;

        switch (dia){
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda";
                break;
            case 3:
                diaSemana = "Terça";
                break;
            case 4:
                diaSemana = "Quarta";
                break;
            case 5:
                diaSemana = "Quinta";
                break;
            case 6:
                diaSemana = "Sexta";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                return "Número Inválido! Forneça um inteiro de 1 a 7";
        }

        if(diaSemana.equals("Domingo")){
            eOMelhorDiaParaIrAFeira = true;
        } else eOMelhorDiaParaIrAFeira = false;

        return "O dia é " + diaSemana + ". É o melhor para ir à feira? " + eOMelhorDiaParaIrAFeira;
    }
}
