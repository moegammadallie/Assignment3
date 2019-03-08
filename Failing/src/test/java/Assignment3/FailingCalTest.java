package Assignment3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FailingCalTest {
    Calclulator cal = new Calclulator();
    int result;

    @Before
    public void setUp() throws Exception {
        result = cal.add(2,2);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add(){
        int expected = 3;
        Assert.assertEquals(expected,result);
    }
}