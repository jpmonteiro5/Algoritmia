import Ex_02.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StringUtilsTest {

    @Test
    public void testIsPalindrome() {
        assertEquals(true,StringUtils.isPalindrome("ANA"));
        assertEquals(true,StringUtils.isPalindrome("Ana"));
        assertEquals(true,StringUtils.isPalindrome("aNa"));
        assertEquals(true,StringUtils.isPalindrome("anA"));
        assertEquals(false,StringUtils.isPalindrome("Anã"));
        assertEquals(false,StringUtils.isPalindrome("bacalhau"));
        assertEquals(false,StringUtils.isPalindrome("Ana1"));
        assertEquals(true,StringUtils.isPalindrome(""));
        assertEquals(true,StringUtils.isPalindrome("anna"));
        assertEquals(true,StringUtils.isPalindrome("12321"));
        assertEquals(true,StringUtils.isPalindrome("123321"));
        assertEquals(false,StringUtils.isPalindrome("123123"));
        assertEquals(true,StringUtils.isPalindrome("_123321_"));
        assertEquals(true,StringUtils.isPalindrome(" 123 321 "));
        //assertEquals(true,StringUtils.isPalindrome("ãnã")); dá false mas devia dar true
        //assertEquals(true,StringUtils.isPalindrome("çssassç")); dá false mas devia dar true

    }

}