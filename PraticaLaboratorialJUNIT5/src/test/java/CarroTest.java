import Ex_06.Carro;
import Ex_06.TipoCombustivel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Ex_06.TipoCombustivel.*;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {
    private Carro carro;

   @Test
  public void testGetIdade() {
       Carro carro = new Carro("Ford", "Fiesta", 1999, 120, 1800, DIESEL, 6.7);
       assertEquals(24, carro.getIdade());
    }

    //carro >30 a DIESEL
    @Test
    public void testLigar() {
        Carro carro = new Carro("Ford", "Fiesta", 1990, 120, 1800, TipoCombustivel.DIESEL, 6.7);
        assertEquals("Deita um pouco de fumo... Custa a pegar... O carro está ligado!",carro.ligar());

    }
}
