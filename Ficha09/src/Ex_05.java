import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //declarar as variáveis
        String marca = "0";
        String modelo = "0";
        int ano = 0;
        String opcao;


        //instanciar um objecto da classe carro
        Carro meuCarro = new Carro(marca, modelo, ano);

        System.out.println("Insira a marca do carro: ");
        marca = input.next();

        System.out.println("Insira o modelo do carro: ");
        modelo = input.next();

        System.out.println("Insira o ano do carro: ");
        ano = input.nextInt();

        // Perguntar ao utilizador se quer ligar o carro
        System.out.print("Deseja ligar o carro? (s/n): ");
        opcao = input.next();

        if (opcao.equals("s")) {
            meuCarro.ligar();
        }
    }
    }