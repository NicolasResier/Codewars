package Number02_CenturyFromYear;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class Tests {
    @Test
    public void FixedTests() {
        assertEquals(18, Main.century(1705));
        assertEquals(19, Main.century(1900));
        assertEquals(17, Main.century(1601));
        assertEquals(20, Main.century(2000));
        assertEquals(1, Main.century(89));
    }
}