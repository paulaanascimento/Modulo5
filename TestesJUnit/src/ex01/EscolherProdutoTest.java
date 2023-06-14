package ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EscolherProdutoTest {

    @Test
    public void deveRetornarProdutoComMenorPreco(){
        EscolherProduto escolherProduto = new EscolherProduto();
        Produto produto1 = new Produto("Motorola Edge 30 Ultra", 4500);
        Produto produto2 = new Produto("Xiaomi POCO F5", 3000);
        Produto produto3 = new Produto("Galaxy S23 Ultra", 6150);
        String produtoEscolhido = escolherProduto.indicaProdutoMaisBarato(produto1, produto2, produto3);

        Assertions.assertEquals("Xiaomi POCO F5", produtoEscolhido);
    }
}
