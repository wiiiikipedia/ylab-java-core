import org.testng.Assert;
import org.testng.annotations.Test;

import static task3.example.Application.fuzzySearch;

public class FuzzySearchTest {
    @Test
    public void test() throws Exception {

        Assert.assertEquals(fuzzySearch("car", "ca6$$#_rtwheel"), true);
        Assert.assertEquals(fuzzySearch("cwhl", "cartwheel"), true);
        Assert.assertEquals(fuzzySearch("cwhee", "cartwheel"), true);
        Assert.assertEquals(fuzzySearch("cartwheel", "cartwheel"), true);
        Assert.assertEquals(fuzzySearch("cwheeel", "cartwheel"), false);
        Assert.assertEquals(fuzzySearch("lw", "cartwheel"), false);
    }

}

