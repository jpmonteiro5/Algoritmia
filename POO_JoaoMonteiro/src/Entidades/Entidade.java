package Entidades;

public abstract class Entidade {

    //Atributos
    private String nome;
    private int hp;
    private int forca;

    //Construtor de Entidade
    public Entidade(String nome, int hp, int forca) {
        this.nome = nome;
        this.hp = hp;
        this.forca = forca;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }


    //método mostrarDetalhes
    public abstract void mostrarDetalhes();

}
