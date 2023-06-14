package ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcularDiasSemanaTest {

    @Test
    public void deveRetornarODiaDaSemanaEFalse(){
        CalcularDiasSemana calcularDiasSemana = new CalcularDiasSemana();
        String resultado = calcularDiasSemana.diaDaSemana(4);
        Assertions.assertEquals("O dia é Quarta. É o melhor para ir à feira? false", resultado);
    }

    @Test
    public void deveRetornarODiaDaSemanaETrue(){
        CalcularDiasSemana calcularDiasSemana = new CalcularDiasSemana();
        String resultado = calcularDiasSemana.diaDaSemana(1);
        Assertions.assertEquals("O dia é Domingo. É o melhor para ir à feira? true", resultado);
    }
}
