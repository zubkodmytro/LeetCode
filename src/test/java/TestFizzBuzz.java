import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFizzBuzz {
    @Test
    public void test(){
        FizzBuzz solution = new FizzBuzz();
        String[] tmp = {
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"
        };
        List<String> temp = new ArrayList<String>();
        temp.addAll(Arrays.asList(tmp));
        Assert.assertEquals(temp,solution.fizzBuzz(15));
    }
}
