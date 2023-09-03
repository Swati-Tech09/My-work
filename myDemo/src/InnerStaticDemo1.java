public class InnerStaticDemo1 {

    //String s ="hello";
    static String b = "Hello Swati";

    public static class test {
        void display() {
            System.out.println("Inside Static " + b);
        }
    }
}
