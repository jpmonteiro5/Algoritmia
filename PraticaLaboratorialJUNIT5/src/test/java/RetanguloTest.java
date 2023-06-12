import Ex_04.Retangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {

    private Retangulo retangulo;

    @BeforeEach
    public void setUp() {
        retangulo = new Retangulo(20, 40);
    }

    @Test
    public void testCalcularPerimetro() {
        assertEquals(120, retangulo.calcularPerimetro());
    }

    @Test
    public void testCalcularArea() {
        assertEquals(800, retangulo.calcularArea());
    }
}

