import java.util.Collections;
import java.util.stream.Collectors;

public class StringDescendation {
    public String solution (String s){
        return s.chars().mapToObj(c -> (char) c).sorted(Collections.reverseOrder()).map(String::valueOf).collect(Collectors.joining());
    }
}
