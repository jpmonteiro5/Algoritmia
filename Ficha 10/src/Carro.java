public class Carro {


    // ALT+INSERT para fazer getter setter e construtor
    
    // Atributos de instância
    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private int cilindrada;
    private String tipoCombustivel;
    private Double litros100Km;
    private int idade;

    //método construtor
    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, String tipoCombustivel, Double litros100Km, int idade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.litros100Km = litros100Km;
        this.idade = idade;
    }

    //Método que imprime na consola que o carro está ligado
    public void ligar() {
        if(idade>30){
            if(TipoCombustivel.DIESEL){
                System.out.println("Deita um pouco de fumo… Custa a pegar… O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }else{
                System.out.println("Custa a pegar… O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }
        }else{
            if(potencia<250){
                System.out.println("O carro está ligado!");
                System.out.println("Vruummmmmmm");
            }else{
                System.out.println("O carro está ligado!");
                System.out.println("VRUUMMMMMM");
            }
        }
    }

    public Carro corrida(Carro adversario){
        if(this.potencia>adversario.potencia) {
            return this;
        }else if(this.potencia<adversario.potencia){
            return adversario;
        }else {
            if (this.cilindrada > adversario.cilindrada) {
                return this;
            }else if (this.cilindrada < adversario.cilindrada) {
                return adversario;
            }else {
                if (this.idade > adversario.idade) {
                    return adversario;
                } else if (this.cilindrada < adversario.cilindrada) {
                    return this;
                }else{
                    return null;
                }
            }
        }
    }

    public double consumo(double dist){
        return (dist*this.litros100Km)/100;
    }
}
