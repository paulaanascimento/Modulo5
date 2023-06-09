package ex04;

public class Caixa {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.deposita(100);
        minhaConta.setLimite(100);
        try {
            minhaConta.saca(1000);
        }catch (ContaExcecao erro){
            System.out.println(erro.getMessage());
            System.out.println("Saldo Atual: " + erro.getSaldo());
        }
    }
}
