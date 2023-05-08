//Crie uma classe chamada "Livro" com os seguintes atributos: título, autor, categoria, número de páginas e
//ISBN. Em seguida, crie um método na classe "Livro" chamado "exibirDetalhes" que imprime na consola
//todos os atributos do livro. De seguida, crie dois objetos da classe "Livro" e invoque o método
//"exibirDetalhes"
public class Livro {

    // Atributos de instância
    private String titulo;
    private String autor;
    private String categoria;
    private int paginas;
    private String ISBN;

    public Livro(String titulo, String autor, String categoria, int paginas, String ISBN){
        this.titulo=titulo;
        this.autor=autor;
        this.categoria=categoria;
        this.paginas=paginas;
        this.ISBN=ISBN;
    }
    public void exibirDetalhes(){
        System.out.println("Título: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Número de Páginas: "+this.paginas);
        System.out.println("ISBN: "+this.ISBN);
    }
}
