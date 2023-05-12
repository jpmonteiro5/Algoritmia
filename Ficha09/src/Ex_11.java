

public class Ex_11 {
    public static void main(String[] args) {

        Conta conta1 = new Conta("1", 1000, "Zé");
        Conta conta2 = new Conta("2", 10000, "Tó");

        /*conta1.transferencia(1500, conta2);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        */

        conta1.depositar(1000);
        conta1.depositar(1000);
        conta2.getSaldo();
        System.out.println("Saldo da conta" + conta2.getNumConta() + ": " + conta2.getSaldo());
    }
}
