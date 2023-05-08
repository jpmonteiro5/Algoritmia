public class circulo {

    // Atributos de instância
    private double raio;

    // Atributos de classe
    private static double pi=3.14159;

    // Método construtor
    public circulo(double raio){
        this.raio = raio;
    }

    // Método get
    public double getRaio(){
        return this.raio;
    }

    // Método set
    public void setRaio(double raio) {
        this.raio = raio;
    }

    //Método para calcular a área
    public double Area(){
        return pi*(this.raio*this.raio);
    }

    //Método para calcular o perímetro
    public double Perimetro(){
        return 2*pi*this.raio;
    }
}
