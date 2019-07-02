import org.junit.Assert;
import org.junit.Test;

public class TestRobotReturnToOrigin {
    @Test
    public void test() {
        RobotReturnToOrigin solution = new RobotReturnToOrigin();
        Assert.assertTrue(solution.judgeCircle("LR"));
        Assert.assertTrue(solution.judgeCircle("LRUDDURL"));
        Assert.assertFalse(solution.judgeCircle("LU"));
        Assert.assertFalse(solution.judgeCircle("LRUULRUD"));
    }
}
