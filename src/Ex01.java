import java.io.*;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) throws FileNotFoundException {
        /*ABRIR FICHEIRO EXISTENTE*/
        File meuFile = new File("exercicio_01_Alternativa01.txt");
        Scanner meuScanner = new Scanner(meuFile);
       while(meuScanner.hasNextLine()) {
           System.out.println(meuScanner.nextLine());
       }
        meuScanner.close();
    }
}