public class Ex_01 {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Ford", "Fiesta" , 1999, 225, 1800, TipoCombustivel.DIESEL, 7.0, 24);
        Carro carro2 = new Carro("Nissan", "Qashqai" , 2018, 190, 1100, TipoCombustivel.GPL, 9.3, 5);

        System.out.println(carro1.corrida(carro2));

        carro2.consumo(97);

        carro1.consumoMaior(carro2,97);
    }
}
