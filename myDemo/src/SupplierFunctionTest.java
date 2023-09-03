import java.util.function.Supplier;

public class SupplierFunctionTest {
    public static void main(String[] args) {
        Supplier<String> s =()-> "Hello Swati";
        System.out.println(s.get());
    }
}
