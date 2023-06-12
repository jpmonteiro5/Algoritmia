package Ex_05;

public class Funcionario {

    // Atributos de instância
    private String nome, departamento;
    private double salario;

    public Funcionario(String nome, double salario, String departamento){
        this.nome=nome;
        this.salario=salario;
        this.departamento=departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Método para aumentar o salário
     * @param aumento - Recebe um valor percentual
     */
    public void aumentarSalario(double aumento){
        this.salario*=(1+(aumento/100));
    }

    public void exibirDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Salário: "+this.salario);
        System.out.println("Departamento: "+this.departamento);
    }
}