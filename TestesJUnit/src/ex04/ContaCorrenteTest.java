package ex04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTest {

    @Test
    public void deveAumentarOSaldo(){
        ContaCorrente conta = new ContaCorrente("1111", "Sheila", 100);
        conta.depositoConta(100);
        double novoSaldo = conta.getSaldo();

        Assertions.assertEquals(200, novoSaldo);
    }

    @Test
    public void deveLancarExcecaoParaSaldoMenorQueCinco(){
        ContaCorrente conta = new ContaCorrente("2222", "Thomaz");

        Assertions.assertThrows(UnsupportedOperationException.class, () -> conta.saqueConta(50));
    }

    @Test
    public void deveLancarExcecaoParaValorSacadoMaiorQueSaldo(){
        ContaCorrente conta = new ContaCorrente("3333", "Pamela", 500);

        Assertions.assertThrows(IllegalArgumentException.class, () -> conta.saqueConta(550));
    }
}
