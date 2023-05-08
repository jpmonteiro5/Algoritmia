public class Ex_09 {
    public static void main(String[] args) {
        Produto prod = new Produto("pão", 1, 10);

        prod.comprar(5);
        prod.vender(2);
        System.out.println("\nTem "+prod.getStock()+ " unidades em stock!\n");

    }
}
