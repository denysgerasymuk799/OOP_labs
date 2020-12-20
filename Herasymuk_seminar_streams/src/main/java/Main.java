import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Task 1
        List<String> mapping1 = new ArrayList<>();
        List<String> mapping2 = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            mapping1.add(String.valueOf(i));
            mapping2.add(String.valueOf(i));
        }

        mapping2.add("abc");

        System.out.println("MapTask.mapping(mapping1) == " + MapTask.mapping(mapping1));
        System.out.println("MapTask.mapping(mapping2) == " + MapTask.mapping(mapping2));

        // Task 2
        List<String> flatting1 = Arrays.asList("abc", "def", "ghj");
        System.out.println("FlattingTask.flattingStrings(flatting1) == " +
                FlattingTask.flattingStrings(flatting1));

        // Task 3
        System.out.println(FizzBuzzTask.fizzBuzzIt(20));

        // Task 4
        System.out.println(GroupWordsTask.groupIt(Arrays.asList("abbc", "cb", "cv", "ac")));
    }
}
