import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public static Map<String, Integer> groupIt(List<String> source) {
        return source.stream()
                .collect(Collectors.groupingBy(x -> String.valueOf(x.charAt(0))))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, x -> {
                    String s = String.join("", x.getValue());
                    return s.length() - s.replace(x.getKey(), "").length();
                }));
    }
}
