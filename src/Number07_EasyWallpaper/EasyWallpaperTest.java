package Number07_EasyWallpaper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EasyWallpaperTest {
    private Main easyWallpaper;

    @Before
    public void setUp() {
        easyWallpaper = new Main();
    }

    @After
    public void tearDown() {
        easyWallpaper = null;
    }

    @Test
    public void test1() {
        assertEquals("ten", easyWallpaper.wallpaper(4, 3.5, 3));
    }

    @Test
    public void test2() {
        assertEquals("sixteen", easyWallpaper.wallpaper(6.3, 4.5, 3.29));
    }

    @Test
    public void test3() {
        assertEquals("seventeen", easyWallpaper.wallpaper(6.3, 5.8, 3.13));
    }
}
