package ex04;

public class ContaCorrente {

    private String numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaCorrente(String numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public ContaCorrente(String numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
    }

    public void depositoConta(double valor){
        this.saldo = saldo + valor;
    }

    public void saqueConta(double valor){
        if(saldo < 5){
            throw new UnsupportedOperationException("Não é possível sacar, pois o saldo é menor que 5 reais");
        } else if (valor > saldo) {
            throw new IllegalArgumentException("O valor informado é maior que o saldo!");
        } else this.saldo = saldo + valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
