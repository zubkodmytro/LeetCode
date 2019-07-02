import org.junit.Assert;
import org.junit.Test;

public class TestReverseString {
    @Test
    public void test(){
        ReverseString solution = new ReverseString();
        Assert.assertEquals("LOL",solution.reverseString("LOL"));
        Assert.assertEquals("DISCO",solution.reverseString("OCSID"));
        Assert.assertEquals("A",solution.reverseString("A"));
    }
}
