package Entidades;

import Itens.Arma;
import Itens.PocaoHP;

import java.util.ArrayList;

public class Cavaleiro extends Hero {
    public Cavaleiro(String nome, int vida, int forca, int nivel, int ouro) {
        super(nome, vida, forca, nivel, ouro);
    }

    //Método subscrito da classe NPC
    @Override
    public void atacar(NPC npc) {


        while (this.getHp()>=0 && npc.getHp()>=0) {
            // O inimigo ataca primeiro (80% da força original)
            int danoInimigo = (int) (npc.getForca() * 0.8); // sofre apenas 80% do dano porque ele tem armardura
            this.subtrairVida(danoInimigo); // que é a quantidade passada no parametro da funcao na classe Heroi
            System.out.println(this.getHp());

            // Verifica se o herói ainda está vivo
            if (this.getHp() <= 0) {
                System.out.println("O herói foi derrotado.");
            } else {
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
                }
            }

        }
    }

    // Método vindo da classe Entidade, obrigatório a todas.

    @Override
    public void mostrarDetalhes() {

    }

}