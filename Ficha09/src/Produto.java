public class Produto{

    // Atributos de instância
    private String nome;
    private double preco;
    private int stock;

    // Método construtor
    public Produto(String nome, double preco, int stock){
        this.nome=nome;
        this.preco=preco;
        this.stock=stock;
    }

    //Métodos get
    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getStock(){
        return this.stock;
    }

    //Métodos comprar e vender
    public void comprar(int quant){
        this.stock += quant;
    }

    public void vender(int quant){
        if(this.stock >= quant) {
            this.stock -= quant;
        }else{
            System.out.println("Stock insuficiente para venda");
        }
    }
}


