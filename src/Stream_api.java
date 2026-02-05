import java.util.*;
import java.util.stream.*;
public class Stream_api {
    static void main(String[] args) {
        List<Integer> numbers = new Arrays.asList(1,2,3,4,5,6,7);
        numbers.stream().
                filter(n -> n%2==0).
                map(n -> n*2).
                forEach(System.out::println);
    }
}
