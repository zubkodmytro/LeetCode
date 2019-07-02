import org.junit.Assert;
import org.junit.Test;

public class TestContainsDuplicate {
    @Test
    public void test() {
        ContainsDuplicate solution = new ContainsDuplicate();
        int[] arrNoDuplicate = {1,2,5,7,4,3,8};
        Assert.assertFalse(solution.containsDuplicate(arrNoDuplicate));
        int[] arrDuplicate = {1,2,1,7,4,3,8};
        Assert.assertTrue(solution.containsDuplicate(arrDuplicate));
    }
}
