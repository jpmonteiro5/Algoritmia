public class rectangulo {

    // Definir os atributos
    private double largura;

    private double altura;

    // Método construtor
    public rectangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }


    public double getLargura(){
        return this.largura;
    }

    public double getAltura(){
        return this.altura;
    }

    //Método para calcular a área
    public double Area(){
        return this.altura*this.largura;
    }

    //Método para calcular o perímetro
    public double Perimetro(){
        return ((this.altura*2)+(this.largura*2));
    }
}
