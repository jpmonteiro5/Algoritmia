package Entidades;

import Itens.Arma;
import Itens.PocaoHP;

import java.util.ArrayList;

public class Arqueiro extends Hero {
    public Arqueiro(String nome, int vida, int forca, int nivel, int ouro) {
        super(nome, vida, forca, nivel, ouro);
    }

    //Método subscrito da classe NPC
    @Override
    public void atacar(NPC npc) {
        while (this.getHp()>=0 && npc.getHp()>=0) {

            // O herói ataca
            int danoHeroi = this.getForca() + this.getArma().getAtaque();
            npc.setHp(npc.getHp() - danoHeroi);
            System.out.println(npc.getHp());
            //npc.subtrairVida(danoHeroi);

            // Verifica se o inimigo ainda está vivo
            if (npc.getHp() <= 0) {
                System.out.println("O herói venceu!");
                this.subirNivel();
                this.aumentarVida(10);
                this.aumentarForca(1);
                this.incrementarOuro(10);
            } else {
                // O inimigo ataca)
                int danoInimigo = (int) (npc.getForca() * 1.1); // 10% a mais do que devido a falta de proteçãop
                this.subtrairVida(danoInimigo); // que é a quantidade passada no parametro da funcao na classe Heroi
                System.out.println(this.getHp());

                if (this.getHp() <= 0) {
                    System.out.println("O herói foi derrotado.");
                }
            }
        }
    }

    // Método vindo da classe Entidade, obrigatório a todas.
    @Override
    public void mostrarDetalhes() {
        System.out.println("Detalhes do Arqueiro:");
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getHp());
        System.out.println("Força: " + getForca());
        System.out.println("Nível: " + getNivel());
        System.out.println("Ouro: " + getOuro());
        System.out.println("Arma: " + getArma().getNome());
        System.out.println("Poções: " + getPocaoHP().size());
    }
}
