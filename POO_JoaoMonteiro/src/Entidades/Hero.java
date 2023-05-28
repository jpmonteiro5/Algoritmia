package Entidades;
import Itens.Arma;
import Itens.PocaoHP;
import java.util.ArrayList;


//Classe abstrata Heroi, expande a classe mãe chamada Entidade
public abstract class Hero extends Entidade {

    //declarar variáveis
    private int nivel;
    private int ouro;
    private Arma arma;
    private ArrayList<PocaoHP> pocaoHP;

    //constructor de Hero
    public Hero(String nome, int hp, int forca, int nivel, int ouro) {
        super(nome, hp, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.pocaoHP = new ArrayList<PocaoHP>();
    }

    //getters e setters
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public ArrayList<PocaoHP> getPocaoHP() {
        return pocaoHP;
    }

    public void setPocaoHP(ArrayList<PocaoHP> pocaoHP) {
        this.pocaoHP = pocaoHP;
    }

    //método abstracto para atacar o NPC
    public abstract void atacar(NPC npc);

    //Método para retirar ouro da conta do Heroi caso ele compre um item
    public void retirarOuro(int quantidade) {
        ouro -= quantidade;
    }

    //método para usar poção
    public void usarPocao(PocaoHP pocao) {
        // Imprimir o inventário do herói
        System.out.println("Inventário do Herói:");
        for (PocaoHP p : pocaoHP) {
            System.out.println(p.getNome());
        }

        // Perguntar qual poção deseja usar
        System.out.println("Qual poção deseja usar?");
        String nomePocao = ""; // Substituir pelo nome da poção selecionada

        // Procurar a poção no inventário
        PocaoHP pocaoSelecionada = procurarPocao(nomePocao);

        // Verificar se a poção foi encontrada
        if (pocaoSelecionada != null) {
            // Incrementar a vida do herói com a vida da poção
            int vidaRecuperada = pocaoSelecionada.getCura();
            aumentarVida(vidaRecuperada);

            // Remover a poção do inventário
            pocaoHP.remove(pocaoSelecionada);

            System.out.println("Poção usada com sucesso!");
        } else {
            System.out.println("A poção selecionada não está no inventário do herói.");
        }
    }


    //método que procura  uma poção no inventário
    private PocaoHP procurarPocao(String nomePocao) {
        for (PocaoHP pocao : pocaoHP) {
            if (pocao.getNome().equals(nomePocao)) {
                return pocao;
            }
        }
        return null;
    }

    //método que aumenta o ouro
    public void incrementarOuro(int quantidade) {
        ouro += quantidade;
    }

    //método que aumenta o nível
    public void subirNivel() {
        nivel++;
    }

    //método que aumenta a força do heroi quando ele ganha uma batalha
    public void aumentarForca(int quantidade) {
        setForca(getForca() + quantidade);
    }

    // Método para aumentar a vida do herói
    public void aumentarVida(int quantidade) {
        setHp(getHp() + quantidade);
    }

    //Método que subtrai vida do Heroi
    public void subtrairVida(int quantidade) {
        // metodo chamado nos herois em si que recebem danos NPC
        setHp(getHp() - quantidade);
    }

    //Método para adicionar poção
    public void adicionarPocao(PocaoHP pocao) {  // MÉTODO NÃO PEDIDO NO ENUNCIADO
        pocaoHP.add(pocao);
    }
}