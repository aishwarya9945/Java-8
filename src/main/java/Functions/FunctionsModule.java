package functions;

import java.util.function.*;
import java.util.*;

public class FunctionsModule {

    public static void main(String[] args) {
        problem91();
        problem92();
        problem93();
        problem94();
    }

    // Problem 91: Chain multiple Predicates
    private static void problem91() {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> greaterThan10 = n -> n > 10;
        boolean result = isEven.and(greaterThan10).test(12);
        System.out.println("Problem 91 Output: " + result); // true
    }

    // Problem 92: Function.andThen vs compose
    private static void problem92() {
        Function<Integer,Integer> doubleIt = n -> n*2;
        Function<Integer,Integer> addTen = n -> n+10;
        System.out.println("Problem 92 andThen: " + doubleIt.andThen(addTen).apply(5)); // 20
        System.out.println("Problem 92 compose: " + doubleIt.compose(addTen).apply(5)); // 30
    }

    // Problem 93: Consumer.andThen chaining
    private static void problem93() {
        Consumer<String> print = s -> System.out.println("Print: " + s);
        Consumer<String> upper = s -> System.out.println("Upper: " + s.toUpperCase());
        print.andThen(upper).accept("java");
    }

    // Problem 94: Supplier → lazy object creation
    private static void problem94() {
        Supplier<List<String>> supplier = ArrayList::new;
        List<String> list = supplier.get();
        list.add("Hello");
        System.out.println("Problem 94 Output: " + list);
    }
}
