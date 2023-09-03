import java.util.function.Consumer;

public class ConsumerFunctionalTest {
    public static void main(String[] args) {
        Consumer<String> log =(String t)->{
            System.out.println("test " +t);
        };
        log.accept("hello");
    }
}
