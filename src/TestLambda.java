import java.util.Arrays;
import java.util.List;

public class TestLambda {
    List<String> list = Arrays.asList("123","abc","789");

    public static void main(String[] args) {
        List<String> list = Arrays.asList("123","abc","789");
        list.forEach(System.out::println);
    }
}
