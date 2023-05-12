public class Conta {

    // Atributos de instância
    private String numConta;
    private double saldo;
    private String titConta;

    //Método construtor
    public Conta(String numConta, double saldo, String titConta) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titConta = titConta;
    }

    //Método transferência
    public double transferencia(double transf, Conta contaDestino) {
        if (this.saldo >= transf) {
            this.saldo -= transf;
            contaDestino.saldo += transf;
            System.out.println("Transferência concluída.");
            return saldo;
        }else {
            System.out.println("Saldo insuficiente.");
            return saldo;
        }
    }

    public double depositar(double valorDep){
        this.saldo+= valorDep;
        System.out.println("Depósito concluído com sucesso. Valor do saldo actual: " + this.saldo);
        return this.saldo;
    }


    public double getSaldo(){
        return this.saldo;
    }

    public String getNumConta(){
        return this.numConta;
    }
}