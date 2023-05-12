public class Funcionario {

    // Atributos de instância
    private String nome;
    private double salario;
    private String departamento;

    //Método construtor
    public Funcionario(String nome, double salario, String departamento){
        this.nome=nome;
        this.salario=salario;
        this.departamento=departamento;
    }

    //Métodos aumentar salário e exibir dados
    public double aumSal(double aumento){
        return this.salario *= (1+(aumento/100));
    }

    public void dados(){
        System.out.println("Nome do funcionário: " + this.nome);
        System.out.println("Salário do funcionário: " + this.salario);
        System.out.println("Departamento do funcionário: " + this.departamento);
    }



}
