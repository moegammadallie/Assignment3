package Assignment3;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalTest {
    Calculator cal = new Calculator();

    @Test
    public void add() {
        int result = cal.add(2,4);
        assertEquals(6,result);
    }
    @Ignore
    @Test
    public void divide() {
        int result = cal.divide(4,2);
        assertEquals(2,result);
    }
}