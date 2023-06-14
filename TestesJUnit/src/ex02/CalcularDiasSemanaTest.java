package ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcularDiasSemanaTest {

    @Test
    public void deveRetornarODiaDaSemanaEDizerSeEOMelhorParaIrAFeira(){
        CalcularDiasSemana calcularDiasSemana = new CalcularDiasSemana();
        String resultado = calcularDiasSemana.diaDaSemana(4);
        Assertions.assertEquals("O dia é Quarta. É o melhor para ir à feira? false", resultado);
    }
}
