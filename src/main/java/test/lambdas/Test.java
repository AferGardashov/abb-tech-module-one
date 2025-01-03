package test.lambdas;

import java.util.*;
import java.util.function.*;

public class Test {

    public static void main(String[] args) {

//        Runnable r = () -> System.out.println("Hello world");
//        r.run();
//
//        Comparator<String> c = (s1, s2) -> {
//            return s1.compareTo(s2);
//        };
//        System.out.println(c.compare("Salam", "dunya"));
//
//
//        //Method reference 1
//        Consumer<Integer> consumer1 = System.out::println;
//        consumer1.accept(15);
//
//        //Method reference 2
//        String s = "Salam";
//        Function<String, Integer> consumer2 = String::length;
//
//        //Method reference 3
//        Function<String, Integer> consumer3 = String::length;
//        consumer3.apply("Salam");
//
//        //Method reference 4
//        Supplier<List<String>> supplier = ArrayList::new;
//        supplier.get();
//
//
//        Map<String, Supplier<Shape>> factory = new HashMap<>();
//        factory.put("circle", Circle::new);
//        factory.put("square", Square::new);
//
//        Map<String, Shape> map = new HashMap<>();
//        map.put("circle", new Circle());


        Runnable run = () -> System.out.println("Hello lambda");
        run.run();

        Consumer<String> consumer = System.out::println;
        Consumer<String> consumer1 = s -> System.out.println();
        consumer.accept("Input string");

        BinaryOperator<Double> binaryOperator = Math::pow;
        binaryOperator.apply(2.0, 5.0);
        BiFunction<Double, Double, Double> function = (a, b) -> a * b;
        function.apply(2.0, 3.0);

        List<Integer> numbers = Arrays.asList(5, 3, 8, 1);
        Collections.sort(numbers, (n1, n2) -> n2 - n1);
        Collections.sort(numbers, Integer::compareTo);
        System.out.println(numbers);

        Supplier<StringBuilder> supplier = StringBuilder::new;
        Supplier<StringBuilder> supplier1 = () -> new StringBuilder();

        Function<String, Integer> function1 = s -> s.length();
        Function<String, Integer> function2 = String::length;

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Predicate<Integer> predicate = n -> n % 2 == 0;
        for (Integer i : numbers1) {
            if (predicate.test(i))
                System.out.println(i);
        }


        Predicate<Integer> pre1 = n -> n % 2 == 0;
        Predicate<Integer> pre2 = n -> n > 10;
        Predicate<Integer> preCombinedAnd = pre1.and(pre2);
        Predicate<Integer> preCombinedOr = pre1.or(pre2);
        System.out.println(preCombinedAnd.test(5));
        System.out.println(preCombinedOr.test(5));

        Runnable run1 = () -> System.out.println("Task 1");
        Runnable run2 = () -> System.out.println("Task 2");
        Runnable run3 = () -> System.out.println("Task 3");
        run1.run();
        run2.run();
        run3.run();


        BinaryOperator<Integer> binaryOperator2 = (a, b) -> Math.max(a, b);
        BinaryOperator<Integer> binaryOperator1 = Math::max;
        System.out.println(binaryOperator1.apply(45, 123));


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        BiFunction<Integer, Integer, Integer> biFunction = Integer::sum;
        BiFunction<List<Integer>, Integer, Integer> biFunction1 = (a, b) -> {
            int sum = 0;
            for (Integer i : a) {
                sum += i;
            }
            return sum + b;
        };
        System.out.println(biFunction1.apply(list, 15));


///////////////////////////////////////////////////////////////////////////////////////////

        TriFunction<Integer, Integer, Integer, Integer> triFunction = (a, b, c) -> (a + b + c) / 3;
        System.out.println(triFunction.result(15, 25, 35));

        Predicate<Integer> check3 = n -> n % 3 == 0;
        Predicate<Integer> check5 = n -> n % 5 == 0;
        Predicate<Integer> check3and5 = check3.and(check5);
        Predicate<Integer> check3or5 = check3.or(check5);


        List<String> words = Arrays.asList("banana", "apple", "pear", "cherry");
        Comparator<String> comparator1 = String::compareTo;
        Comparator<String> comparator2 = (a, b) -> Integer.compare(a.length(), b.length());
        Function<Boolean, Comparator<String>> f1 = (a) -> a ? comparator1 : comparator2;
        words.sort(f1.apply(true));
        System.out.println(words);
        words.sort(f1.apply(false));
        System.out.println(words);


        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.replaceAll((key, value) -> value * 2);


        Function<Integer, Integer> s = a -> a + 4;
        Function<Integer, Integer> t = a -> a * 3;
        Function<Integer, Integer> c = s.compose(t);
        System.out.print(c.apply(1));

        Supplier<String> salam = () -> {
            System.out.println("sad");
            return "sadasd";
        };

    }

}
