public class Carro {

    // Atributos de instância
    private String marca;
    private String modelo;
    private int ano;

    //método construtor
    public Carro(String marca, String modelo, int ano){
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
    }

    //Método que imprime na consola que o carro está ligado
    public void ligar() {
        System.out.println("O carro está ligado!");
    }
}
