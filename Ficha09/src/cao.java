public class cao {

    private String nome;
    private String raca;

    public cao(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }


    public String getNome(){
        return this.nome;
    }

    public String getRaca(){
        return this.raca;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public void ladrar(){
        System.out.println("Au au!");
    }
}