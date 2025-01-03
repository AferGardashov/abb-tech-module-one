package test.streams;

import java.util.List;

public class Test {

    public static void main(String[] args) throws Throwable{



//        IntStream
//                .range(1, 5)
//                .skip(2)
//                .forEach(System.out::println);
//
//
//        System.out.println(
//                IntStream
//                        .range(1, 9)
//                        .sum());
//
//        System.out.println(Stream.of(2, 35, 68, 4, 1, 56, 89, 5)
//                .sorted()
//                .findFirst()
//        );
//
//
//        String[] names = {
//                "Alice",
//                "Fibonacci",
//                "Charlie",
//                "Diana",
//                "Ethan",
//                "Fiona",
//                "George",
//                "Fatal",
//                "Fan",
//                "Julia"
//        };
//
//
//        Arrays.stream(names)
//                .filter(s -> s.startsWith("F"))
//                .forEach(System.out::println);
//
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        Arrays.stream(numbers)
//                .map(x -> x * x)
//                .average()
//                .ifPresent(System.out::println);
//
//        List<String> list = Arrays.asList(names);
//        list.stream()
//                .map(String::toLowerCase)
//                .filter(a -> a.startsWith("f"))
//                .sorted()
//                .forEach(System.out::println);
//
//        double total = Stream.of(1.1, 2.5, 5.2)
//                .reduce(0.0, (a, b) -> a + b);
//        System.out.println(total);
//
//        List<Integer> numbers1 = List.of(5, 3, 1, 4, 2);
//        numbers1.stream().sorted().forEach(System.out::println); // Output: 1, 2, 3, 4, 5
//
//
//        List<Integer> numberss = List.of(1, 2, 3, 4, 5, 6);
//        List<Integer> result = numberss.stream()
//                .filter(n -> n % 2 == 0) // Keep only even numbers
//                .map(n -> n * n)         // Square the remaining numbers
//                .toList();
//
//        System.out.println(result); // Output: [4, 16, 36]


//        List<Integer> numbers = List.of(5, 3, 1, 4, 2, 7, 8, 10, 1, 4, 8);
//        List<String> names = List.of("Alice", "Fibonacci", "Fiona", "George", "Fatal", "Fan", "Julia");
//
//
//        List<Integer> newNumbers1 = numbers.stream()
//                .filter(x -> x % 2 == 0).toList();
//
//        List<String> newNames1 = names.stream()
//                .map(String::toUpperCase)
//                .toList();
//
//        int n = numbers.stream()
//                .filter(x -> x > 7)
//                .findFirst()
//                .orElse(1);
//        System.out.println(n);
//
//        List<String> newNames2 = names.stream()
//                .sorted(String::compareToIgnoreCase)
//                .toList();
//        System.out.println(newNames2);
//
//
//        int maxNumber = numbers.stream().max(Integer::compareTo).orElse(-1);
//        int minNumber = numbers.stream().min(Integer::compare).orElse(-1);
//
//        long count = names.stream()
//                .filter(a -> a.startsWith("F"))
//                .count();
//        System.out.println(count);
//
//        double average = numbers.stream()
//                .mapToInt(Integer::intValue)
//                .average()
//                .orElse(0);
//
//        List<Integer> list2 = numbers.stream()
//                .distinct()
//                .toList();
//        System.out.println(list2);



//        List<String> list = List.of("1", "2", "3", "4", "5");
//
//        int n = list.stream()
//                .map(Integer::valueOf)
//                .sorted()
//                .reduce(Integer::sum)
//                .orElse(-1);
//
//        System.out.println(n);
//
//        Stream.generate(() -> Math.random()) // Generate random numbers
//                .limit(5)                      // Limit to 5 elements to prevent infinite loop
//                .forEach(System.out::println);

        var list = List.of("Toby", "Anna", "Leroy", "Alex");
        list.stream()
                .filter(x -> x.length()==4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);

        double d = .5;



    }

}
