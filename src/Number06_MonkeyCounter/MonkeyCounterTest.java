package Number06_MonkeyCounter;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MonkeyCounterTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{1,2,3,4,5},Main.monkeyCount(5));
        assertArrayEquals(new int[]{1,2,3},Main.monkeyCount(3));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9},Main.monkeyCount(9));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10},Main.monkeyCount(10));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},Main.monkeyCount(20));
    }
}
