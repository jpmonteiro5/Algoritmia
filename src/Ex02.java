import java.io.*;
public class Ex02 {
    public static void main(String[] args) throws FileNotFoundException {
    String conteudoFicheiro = "exercicio_02";
    /*CRIAR FICHEIRO VAZIO*/
    File nomeFile = new File("exercicio_02.txt");
    PrintWriter criarFicheiro = new PrintWriter(nomeFile);
/*FIM DA CRIAÇÃO*/

/*IMPRIMIR CONTEUDO NO FICHEIRO ATÉ AGORA VAZIO \/ */
criarFicheiro.print(conteudoFicheiro);

        /*FECHAR FICCHEIRO PARA SALVAR*/
        criarFicheiro.close();
    }
}

