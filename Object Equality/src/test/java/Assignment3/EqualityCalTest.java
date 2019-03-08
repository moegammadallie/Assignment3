package Assignment3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqualityCalTest {
    Calculator cal = new Calculator();

    @Test
    public void add() {
        int result = cal.add(2 ,2);
        Assert.assertEquals(4,result);
    }

    @Test
    public void subtract() {
        int result = cal.subtract(2 ,1);
        Assert.assertEquals(1,result);
    }
}