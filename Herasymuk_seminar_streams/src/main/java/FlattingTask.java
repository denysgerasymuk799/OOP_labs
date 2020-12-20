import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlattingTask {
    public static List<String> flattingStrings(List<String> source) {
        return source.stream()
                .flatMap(x -> Stream.of(x.split("")))
                .collect(Collectors.toList());
    }
}
