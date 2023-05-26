package Itens;

import java.util.ArrayList;

public abstract class ItemHeroi {

    //declarar as variáveis
    private String nome;
    private int preco;
    private ArrayList<TipoHeroi> tipoHeroi;

    //contrutor de ItemHeroi
    public ItemHeroi(String nome, int preco, ArrayList<TipoHeroi> tipoHeroi) {
        this.nome = nome;
        this.preco = preco;
        this.tipoHeroi = tipoHeroi;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public ArrayList<TipoHeroi> getTipoHeroi() {
        return tipoHeroi;
    }

    public void setTipoHeroi(ArrayList<TipoHeroi> tipoHeroi) {
        this.tipoHeroi = tipoHeroi;
    }

    //método mostrarDetalhes
    abstract void mostrarDetalhes();

}
