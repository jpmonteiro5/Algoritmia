import Ex_05.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {
    private Funcionario ze;
    @BeforeEach
    public void setUp() {
    ze = new Funcionario("Zé", 2000, "Comercial");
    }

    @Test
    public void testAumentarSalario() {
        ze.aumentarSalario(50);
        assertEquals(3000, ze.getSalario());
    }

    @Test
    public void testDiminuirSalario() {
        ze.aumentarSalario(-50);
        assertEquals(1000, ze.getSalario());
    }
}
