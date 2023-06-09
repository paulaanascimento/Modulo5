package ex04;

public class Conta {
    private double limite;
    private double saldo;

    public void deposita(double valor) {
        saldo = saldo + valor;
        System.out.println(valor + " depositado com sucesso!");
    }

    public void setLimite(double limite) {
        this.limite = limite;
        System.out.println(limite + " foi definido como novo limite!");
    }

    public void saca(double valor) throws ContaExcecao {
        if (valor > saldo) {
            throw new ContaExcecao("Erro: O valor informado para saque é superior ao disponível em conta", saldo);
        }
        saldo = saldo - valor;
        System.out.println(valor + " sacado com sucesso!");
    }
}
