import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //declarar as variáveis
        double raio;

        //instanciar um novo circulo
        circulo circ = new circulo(0);

        System.out.println("Insira o raio do circulo: ");
        raio = input.nextDouble();

        circ.setRaio(raio);

        System.out.println("Raio: " + circ.getRaio());
        System.out.println("Área: " + circ.Area());
        System.out.println("Perímetro: " + circ.Perimetro());

    }
}
