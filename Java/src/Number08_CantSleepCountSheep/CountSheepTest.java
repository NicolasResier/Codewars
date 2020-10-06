package Number08_CantSleepCountSheep;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CountSheepTest {
    @Test
    public void testSomething() {
        assertEquals("1 sheep...", Main.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", Main.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", Main.countingSheep(3));
}}
