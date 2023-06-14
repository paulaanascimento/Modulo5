package ex01;

public class EscolherProduto {

    public String indicaProdutoMaisBarato(Produto produto1, Produto produto2, Produto produto3){
        if(produto1.getPreco() < produto2.getPreco() && produto1.getPreco() < produto3.getPreco()){
            return produto1.getNome();
        } else if (produto2.getPreco() < produto1.getPreco() && produto2.getPreco() < produto3.getPreco()) {
            return produto2.getNome();
        } else if (produto3.getPreco() < produto1.getPreco() && produto3.getPreco() < produto2.getPreco()) {
            return produto3.getNome();
        }

        return null;
    }
}
