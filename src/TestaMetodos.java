public class TestaMetodos {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        conta.deposita(50);
        System.out.println(conta.saldo);
        conta.saca(20);
        System.out.println(conta.saldo);
        conta.saca(500);
        System.out.println(conta.saldo);
    }
}