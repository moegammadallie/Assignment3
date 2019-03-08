package Assignment3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IdentityStudTest {
    Student stud = new Student();

    String name;
    String surname;
    String university;

    @Before
    public void setUp() throws Exception {
        name = stud.name("Moegammad");
        surname = stud.surname("Allie");
        university = stud.uni("CPUT");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void name() {
        String nme = "Moegammad";
        Assert.assertSame(nme,name);
    }

    @Test
    public void surname() {
        String snme = "Allie";
        Assert.assertSame(snme,surname);
    }

    @Test
    public void uni() {
        String univ = "CPUT";
        Assert.assertSame(univ,university);
    }
}