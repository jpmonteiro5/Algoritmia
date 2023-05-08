public class Aluno {

    // Atributos de instância
    private String nome;
    private int idade;
    private String curso;
    private double media;

    // Método construtor
    public Aluno(String nome, int idade, String curso, double media){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;
    }

    //Método situação
    public boolean situacao(){
        if (this.media>=9.5){
            System.out.println("Aprovado");
            return true;
        }else{
            System.out.println("Reprovado");
            return false;
        }
    }

}
