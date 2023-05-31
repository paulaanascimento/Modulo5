package ex04;

public class ContaPoupanca extends Conta implements Tributos{
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public double calcularTributos() {
        return 0;
    }
}
