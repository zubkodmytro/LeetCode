import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for(int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                list.add(i+"");
            }
            if (i % 3 == 0 && i % 5 != 0) {
                list.add("Fizz");
            }
            if (i % 3 != 0 && i % 5 == 0) {
                list.add("Buzz");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            }
        }
        return list;
    }
}
