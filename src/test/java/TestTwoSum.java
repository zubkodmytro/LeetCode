import org.junit.Assert;
import org.junit.Test;

public class TestTwoSum {
    @Test
    public void test(){
        TwoSum solution = new TwoSum();
        int[] sol = {0,1};
        int[] test = {2, 7, 11, 15};
        Assert.assertArrayEquals(sol,solution.twoSum(test,9));
    }
}
