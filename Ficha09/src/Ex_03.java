import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis para rectângulo 1
        double largura = 10;
        double altura = 8.5;

        //rectângulo 2 tem os parâmetros inseridos directamente na instância


        //pedir os parâmetros do rectângulo 3 ao utilizador
        System.out.println("Insira largura do triângulo 3: ");
        double largura3 = input.nextDouble();
        System.out.println("Insira altura do rectângulo 3: ");
        double altura3 = input.nextDouble();


        // Instanciar 3 objectos da classe rectângulo
        rectangulo rect1 = new rectangulo(largura, altura);
        rectangulo rect2 = new rectangulo(3, 2);
        rectangulo rect3 = new rectangulo(largura3, altura3);

        //print das áreas e perimetros dos rectangulos
        System.out.println("Área do rectângulo 1: " + rect1.Area());
        System.out.println("Perímetro do rectângulo 1: " + rect1.Perimetro());
        System.out.println("Área do rectângulo 2: " + rect2.Area());
        System.out.println("Perímetro do rectângulo 2: " + rect2.Perimetro());
        System.out.println("Área do rectângulo 3: " + rect3.Area());
        System.out.println("Perímetro do rectângulo 3: " + rect3.Perimetro());

    }
}