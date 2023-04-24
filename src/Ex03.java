import java.io.*;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) throws FileNotFoundException {
        /*ABRIR FICHEIRO EXISTENTE*/
        File meuFile = new File("exercicio_03.txt");
        Scanner meuScanner = new Scanner(meuFile);

        String conteudoFicheiro = meuScanner.close();

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