public class Carro {


    // ALT+INSERT para fazer getter setter e construtor

    // Atributos de instância
    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private int cilindrada;
    private TipoCombustivel combustivel;
    private Double litros100Km;
    private int idade;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    //método construtor
    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel combustivel, Double litros100Km, int idade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.litros100Km = litros100Km;
        this.idade = idade;
    }

    //Método que imprime na consola que o carro está ligado
    public void ligar() {
        if(idade>30){
            if(this.combustivel.equals(TipoCombustivel.DIESEL)){
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
    //

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

    public void consumoMaior(Carro adversario, double dist) {
        if (this.consumo(dist) > adversario.consumo(dist)) {
            System.out.println(this.marca + " tem o maior consumo: " + this.consumo(dist));
        } else if (this.consumo(dist) < adversario.consumo(dist)) {
            System.out.println(adversario.marca + " tem o maior consumo: " + adversario.consumo(dist));
        } else {
            System.out.println("Ambos os carros consomem o mesmo");
        }
    }
}
