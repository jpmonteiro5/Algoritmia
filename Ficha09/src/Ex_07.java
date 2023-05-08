public class Ex_07 {

    //criar dois objectos da classe Livro
    public static void main(String[] args) {
        Livro livro1 = new Livro("Receitas de bacalhau", "Zé Carlos", "Receitas", 234, "dssdfsd232334");
        Livro livro2 = new Livro("1001 pentes para carecas", "Hildeberto Afonso", "Artesanato", 257, "sdasd161ds");

    //invocar o método exibirDetalhes
    livro1.exibirDetalhes();
    System.out.println();
    livro2.exibirDetalhes();

}
}
