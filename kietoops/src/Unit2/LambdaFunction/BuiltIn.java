package Unit2.LambdaFunction;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltIn {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n%2==0;
        Function<Integer, Integer> square = n -> n*n;
        Consumer<String> display = msg -> System.out.println(msg);
        Supplier<Double> randomValue = () -> Math.random();


        System.out.println("is 8 even? " + isEven.test(8));
        System.out.println("Square of 5? " +  square.apply(5));
        display.accept("Hello, Functional Interface!");
        System.out.println("Random number: "+randomValue.get());
    }
}
