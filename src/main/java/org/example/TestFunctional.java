package src.main.java.org.example;

import java.util.function.Function;

public class TestFunctional {
    public static void main(String[] args) {
        Function<Integer,String> f = (Integer i)->
        {
            if (i==0)
            {
              return "Zero" ;
            }
            else {
                return "Non Zero";
            }
        };

        System.out.println(f.apply(5));
    }
}
