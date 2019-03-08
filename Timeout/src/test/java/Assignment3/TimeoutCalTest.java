package Assignment3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class TimeoutCalTest {

    Calculator cal = new Calculator();
    int result;

    @Before
    public void setUp() throws Exception {
        result = cal.add(2 ,4);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(timeout = 1000)
    public void add() {
        int expectedSum = 6;
        Assert.assertEquals(expectedSum , result);
    }
}