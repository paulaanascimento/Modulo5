package ex04;

public class ContaCorrente extends Conta implements Tributos{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double calcularTributos() {
        return getSaldo() * 0.01;
    }
}
