package Number09_GrowthOfPopulation;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GrowthOfPopulationTest {
    @Test
    public void test1() {
        assertEquals(15,Main.nbYear(1500, 5, 100, 5000));
    }
    @Test
    public void test2() {
        assertEquals(10, Main.nbYear(1500000, 2.5, 10000, 2000000));
        }
    @Test
    public void test3() {
        assertEquals(94, Main.nbYear(1500000, 0.25, 1000, 2000000));
    }
}
