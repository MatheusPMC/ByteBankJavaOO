public class TestaMetodos {

    public static void main(String[] args) {
        Conta contaDoMatheus = new Conta();
        contaDoMatheus.saldo = 100;
        contaDoMatheus.deposita(50);
        System.out.println(contaDoMatheus.saldo);
        contaDoMatheus.saca(20);
        System.out.println(contaDoMatheus.saldo);
        contaDoMatheus.saca(500);
        System.out.println(contaDoMatheus.saldo);

        Conta contaDaMury = new Conta();
        contaDaMury.deposita(1000);

        boolean transferencia = contaDaMury.transfere(100, contaDoMatheus);
        if (transferencia) {
            System.out.println("transferencia com sucesso");
            System.out.println(contaDaMury.saldo);
            System.out.println(contaDoMatheus.saldo);
        } else {
            System.out.println("faltou dinheiro");
        }
        contaDoMatheus.titular = "Matheus Marques";
        contaDaMury.titular = "Muryel Kanehira";

    }
}
