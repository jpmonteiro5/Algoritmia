package Entidades;
import Itens.Arma;
import Itens.PocaoHP;
import java.util.ArrayList;

abstract class Hero extends Entidade{
    private int nivel;
    private int ouro;
    private Arma arma;
    private ArrayList<PocaoHP> pocaoHP;

}
