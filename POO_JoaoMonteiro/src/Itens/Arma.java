package Itens;

import java.util.ArrayList;

public class Arma extends ItemHeroi {

    //declarar variáveis
    private int ataque;

    //construtor de Arma
    public Arma(String nome, int preco, ArrayList<TipoHeroi> tipoHeroi, int ataque) {
        super(nome, preco, tipoHeroi);
        this.ataque = ataque;
    }

    //getters e setters
    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Ataque: " + getAtaque());
        System.out.println("Tipo de Herói: " + getTipoHeroi());
        }
    }
}
