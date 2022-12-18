import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void testEmpty(){
        assertThrows(NumberFormatException.class, () -> Integer.decode(""));
    }
    @Test
    public void testZero(){
        assertEquals(0, Integer.decode("00000"));
    }
    @Test
    public void testPlus(){
        assertEquals(1,Integer.decode("+1"));
    }
    @Test
    public void testMinus(){
        assertEquals(-1,Integer.decode("-1"));
    }
    @Test
    public void testStartsWithZero(){
        assertNotEquals(12, Integer.decode("012"));
    }
    @Test
    public void testOcta(){
        assertEquals(10, Integer.decode("012"));
    }
    @Test
    public void testHex(){
        assertEquals(12, Integer.decode("0xC"));
    }
    @Test
    public void testHashtag(){
        assertEquals(12, Integer.decode("#C"));
    }
    @Test
    public void testCatchMinValue(){
        assertEquals(Integer.MIN_VALUE, Integer.decode(Integer.toString(Integer.MIN_VALUE)));
    }
    @Test
    public void testCatchMaxValue(){
        assertEquals(Integer.MAX_VALUE, Integer.decode(Integer.toString(Integer.MAX_VALUE)));
    }
    @Test
    public void testRandomString() {
        assertThrows(NumberFormatException.class, () -> Integer.decode("qwerty"));
    }
}
