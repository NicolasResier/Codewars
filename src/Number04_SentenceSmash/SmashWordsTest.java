package Number04_SentenceSmash;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SmashWordsTest {
    @Test
    public void validate() {
        assertEquals("Bilal Djaghout", Main.smash(new String[] { "Bilal", "Djaghout" }));
    }

    @Test
    public void validateEmpty() {
        assertEquals("", Main.smash(new String[] {}));
    }


    @Test
    public void validateOneWord() {
        assertEquals("Bilal", Main.smash(new String[] {"Bilal"}));
    }
}
