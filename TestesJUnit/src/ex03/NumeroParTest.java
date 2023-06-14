package ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumeroParTest {

    NumeroPar numeroPar = new NumeroPar();

    @Test
    public void deveRetornarTrue(){
        boolean  resultado = numeroPar.ePar(60);

        Assertions.assertTrue(resultado);
    }

    @Test
    public void deveRetornarFalse(){
        boolean  resultado = numeroPar.ePar(61);

        Assertions.assertFalse(resultado);
    }
}
