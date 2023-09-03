import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> b =(String i)->{
            return true;
        };
        System.out.println(b.test("hello"));
    }
}
