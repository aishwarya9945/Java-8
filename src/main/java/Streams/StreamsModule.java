package src.main.java.Streams;

import java.util.*;
import java.util.stream.*;

public class StreamsModule {

    public static void main(String[] args) {
        problem79();
        problem80();
        problem81();
        problem82();
        problem83();
        problem84();
        problem85();
        problem86();
        problem87();
        problem88();
        problem89();
        problem90();
    }

    // Problem 79: Flatten nested list → distinct sorted elements
    private static void problem79() {
        List<List<Integer>> nested = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(2,3,4),
                Arrays.asList(5,6)
        );
        List<Integer> flat = nested.stream()
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Problem 79 Output: " + flat); // [1,2,3,4,5,6]
    }

    // Problem 80: FlatMap sentences → unique words
    private static void problem80() {
        List<String> sentences = Arrays.asList("Java Spring", "Spring Boot");
        Set<String> words = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .collect(Collectors.toSet());
        System.out.println("Problem 80 Output: " + words); // [Java, Spring, Boot]
    }

    // Problem 81: FlatMap list of lists → single list
    private static void problem81() {
        List<List<String>> nested = Arrays.asList(
                Arrays.asList("A","B"),
                Arrays.asList("C","D")
        );
        List<String> flat = nested.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("Problem 81 Output: " + flat); // [A,B,C,D]
    }

    // Problem 82: FlatMap employees → unique skills
    private static void problem82() {
        class Employee { String name; List<String> skills; Employee(String n,List<String> s){name=n;skills=s;} }
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", Arrays.asList("Java","Spring")),
                new Employee("Bob", Arrays.asList("Spring","Docker"))
        );
        Set<String> skills = employees.stream()
                .flatMap(e -> e.skills.stream())
                .collect(Collectors.toSet());
        System.out.println("Problem 82 Output: " + skills); // [Java, Spring, Docker]
    }

    // Problem 83: Reduce → concatenate strings
    private static void problem83() {
        List<String> list = Arrays.asList("Java","Spring","Boot");
        String result = list.stream().reduce("", (a,b) -> a+" "+b).trim();
        System.out.println("Problem 83 Output: " + result); // Java Spring Boot
    }

    // Problem 84: Reduce → longest common prefix
    private static void problem84() {
        List<String> list = Arrays.asList("flower","flow","flight");
        String prefix = list.stream().reduce((a,b) -> {
            int i=0;
            while(i<a.length() && i<b.length() && a.charAt(i)==b.charAt(i)) i++;
            return a.substring(0,i);
        }).orElse("");
        System.out.println("Problem 84 Output: " + prefix); // fl
    }

    // Problem 85: Reduce → sum/max
    private static void problem85() {
        List<Integer> list = Arrays.asList(1,2,3,4);
        int sum = list.stream().reduce(0,Integer::sum);
        int max = list.stream().reduce(Integer::max).orElse(0);
        System.out.println("Problem 85 Sum: " + sum + ", Max: " + max);
    }

    // Problem 86: Peek() for debugging pipeline
    private static void problem86() {
        List<Integer> list = Arrays.asList(1,2,3,4);
        List<Integer> result = list.stream()
                .peek(n -> System.out.println("Before filter: " + n))
                .filter(n -> n%2==0)
                .peek(n -> System.out.println("After filter: " + n))
                .collect(Collectors.toList());
        System.out.println("Problem 86 Output: " + result); // [2,4]
    }

    // Problem 87: Parallel streams (when to use/avoid)
    private static void problem87() {
        List<Integer> list = IntStream.rangeClosed(1,1000).boxed().collect(Collectors.toList());
        int sum = list.parallelStream().reduce(0,Integer::sum);
        System.out.println("Problem 87 Output: " + sum); // 500500
    }

    // Problem 88: Optional → avoid NPE
    private static void problem88() {
        String str = null;
        Optional<String> opt = Optional.ofNullable(str);
        System.out.println("Problem 88 Output: " + opt.orElse("default")); // default
    }

    // Problem 89: Optional.ifPresent / ifPresentOrElse
    private static void problem89() {
        Optional<String> opt = Optional.of("Java");
        opt.ifPresentOrElse(
                v -> System.out.println("Problem 89 Value: " + v),
                () -> System.out.println("Problem 89 Empty")
        );
    }

    // Problem 90: Optional → Stream conversion
    private static void problem90() {
        Optional<String> opt = Optional.of("Spring");
        List<String> list = opt.stream().collect(Collectors.toList());
        System.out.println("Problem 90 Output: " + list); // [Spring]
    }
}
