import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Instanciar um funcionário
        Funcionario func = new Funcionario("Zé Mário", 2000, "Contabilidade");

        // Exibir os dados antes do aumento
        System.out.println("Dados do funcionário antes do aumento:");
        System.out.println();
        func.dados();
        System.out.println();

        // Ler percentagem de aumento
        System.out.print("Insira a percentagem de aumento: ");
        double aumento = input.nextDouble();
        System.out.println();

        // Aumentar o salário
        func.aumSal(aumento);

        // Exibir os dados após o aumento
        func.dados();
    }
}
