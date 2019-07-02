import org.junit.Assert;
import org.junit.Test;

public class TestJewelsAndStones {
    @Test
    public void test() {
        JewelsAndStones solution = new JewelsAndStones();
        Assert.assertEquals(4,solution.numJewelsInStones("aAbC", "aaABcCdE"));
        Assert.assertEquals(0,solution.numJewelsInStones("aBcD", "AAbbCCdd"));
        Assert.assertEquals(1,solution.numJewelsInStones("a", "a"));
        Assert.assertEquals(4,solution.numJewelsInStones("D", "DDaDD"));
    }
}
