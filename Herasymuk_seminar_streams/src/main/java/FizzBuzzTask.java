import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    public static String mapper(int x) {
        if (x % 15 == 0) {
            return "FizzBuzz";
        }
        else if (x % 5 == 0) {
            return "Fizz";
        }
        else if (x % 3 == 0) {
            return "Buzz";
        }

        else {
            return String.valueOf(x);
        }
    }
    public static List<String> fizzBuzzIt(int n) {
        return IntStream.range(1, n).boxed().map(FizzBuzzTask::mapper).collect(Collectors.toList());
    }
}
