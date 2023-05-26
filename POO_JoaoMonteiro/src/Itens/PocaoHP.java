package Itens;

import java.util.ArrayList;

public class PocaoHP extends ItemHeroi {

    //declarar variáveis
    private int cura;

    //construtor PocaoHP
    public PocaoHP(String nome, int preco, ArrayList<TipoHeroi> tipoHeroi, int cura) {
        super(nome, preco, tipoHeroi);
        this.cura = cura;
    }

    //getters e setters
    public int getCura() {
        return cura;
    }

    public void setCura(int cura) {
        this.cura = cura;
    }

    //método mostrarDetalhes
    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome:" + getNome());
        System.out.println("Preço:" + getPreco());
        System.out.println("Curar" + getCura());
        System.out.println("Tipo de Herói: " + getTipoHeroi());

    }
}