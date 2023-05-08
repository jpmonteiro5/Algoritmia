public class Ex_02 {
    public static void main(String[] args) {

        // Instanciar 3 objectos da classe cao
        cao Pintas = new cao("Pintas", "Labrador");
        cao Conguito = new cao("Conguito", "Serra da Estrela");
        cao Chucky = new cao("Chucky", "Galgo");

        // Imprimir as informações do primeiro cão
        System.out.println("Nome da primeira pessoa: " + Pintas.getNome());
        System.out.println("Raça da primeira pessoa: " + Pintas.getRaca());

        // Imprimir enter *para ficar bonito*
        System.out.println();

        // Imprimir as informações do segundo cão
        System.out.println("Nome do segundo cão: " + Conguito.getNome());
        System.out.println("Raça do segundo cão: " + Conguito.getRaca());

        // Imprimir enter *para ficar bonito*
        System.out.println();

        // Imprimir as informações do terceiro cão
        System.out.println("Nome do terceiro cão: " + Chucky.getNome());
        System.out.println("Raça do terceiro cão: " + Chucky.getRaca());

        // Imprimir enter *para ficar bonito*
        System.out.println();

        //Mudar raça dos cães
        Pintas.setRaca("Dogue Alemão");
        Conguito.setRaca("Castro Laboreiro");
        Chucky.setRaca("Serra da Estrela");

        // Imprimir as informações do primeiro cão
        System.out.println("Nome da primeira pessoa: " + Pintas.getNome());
        System.out.println("Raça da primeira pessoa: " + Pintas.getRaca());

        // Imprimir enter *para ficar bonito*
        System.out.println();

        // Imprimir as informações do segundo cão
        System.out.println("Nome do segundo cão: " + Conguito.getNome());
        System.out.println("Raça do segundo cão: " + Conguito.getRaca());

        // Imprimir enter *para ficar bonito*
        System.out.println();

        // Imprimir as informações do terceiro cão
        System.out.println("Nome do terceiro cão: " + Chucky.getNome());
        System.out.println("Raça do terceiro cão: " + Chucky.getRaca());

        // Imprimir enter *para ficar bonito*
        System.out.println();

        //Ladrar
        Pintas.ladrar();
    }
    }