package src.main.java.Maps;

import java.util.*;
import java.util.stream.*;

public class MapsModule {

    public static void main(String[] args) {
        problem66();
        problem67();
        problem68();
        problem69();
        problem70();
        problem71();
        problem72();
        problem73();
        problem74();
        problem75();
        problem76();
        problem77();
        problem78();
    }

    // Problem 66: Count frequency of words in sentence
    private static void problem66() {
        String text = "apple banana apple grape";
        Map<String, Long> freq = Arrays.stream(text.split("\\s+"))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println("Problem 66 Output: " + freq);
    }

    // Problem 67: Count frequency of characters
    private static void problem67() {
        String text = "banana";
        Map<Character, Long> freq = text.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("Problem 67 Output: " + freq);
    }

    // Problem 68: Find most frequent element in list
    private static void problem68() {
        List<String> list = Arrays.asList("a","b","a","c","a","b");
        Map<String, Long> freq = list.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        String most = freq.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse("");
        System.out.println("Problem 68 Output: " + most); // a
    }

    // Problem 69: Top K frequent elements
    private static void problem69() {
        List<String> list = Arrays.asList("a","b","a","c","a","b","c","c");
        int k = 2;
        Map<String, Long> freq = list.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        List<String> topK = freq.entrySet().stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .limit(k).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("Problem 69 Output: " + topK); // [a, c]
    }

    // Problem 70: Frequency of words in string
    private static void problem70() {
        String text = "apple apple banana";
        Map<String, Long> freq = Arrays.stream(text.split("\\s+"))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println("Problem 70 Output: " + freq);
    }

    // Problem 71: Find duplicate words in sentence
    private static void problem71() {
        String text = "apple banana apple grape banana";
        Map<String, Long> freq = Arrays.stream(text.split("\\s+"))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        List<String> duplicates = freq.entrySet().stream()
                .filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("Problem 71 Output: " + duplicates);
    }

    // Problem 72: Filter map by value
    private static void problem72() {
        Map<String, Integer> map = Map.of("A", 10, "B", 5, "C", 20);
        Map<String, Integer> filtered = map.entrySet().stream()
                .filter(e -> e.getValue() > 10)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Problem 72 Output: " + filtered); // {C=20}
    }

    // Problem 73: Sort map by value (descending)
    private static void problem73() {
        Map<String, Integer> map = Map.of("A", 10, "B", 5, "C", 20);
        Map<String, Integer> sorted = map.entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1,e2)->e1, LinkedHashMap::new));
        System.out.println("Problem 73 Output: " + sorted);
    }

    // Problem 74: Map.computeIfAbsent → list valued map
    private static void problem74() {
        Map<String, List<String>> map = new HashMap<>();
        map.computeIfAbsent("fruits", k -> new ArrayList<>()).add("apple");
        map.computeIfAbsent("fruits", k -> new ArrayList<>()).add("banana");
        System.out.println("Problem 74 Output: " + map); // {fruits=[apple, banana]}
    }

    // Problem 75: Map.merge → count frequencies
    private static void problem75() {
        String text = "apple banana apple";
        Map<String, Integer> freq = new HashMap<>();
        for (String word : text.split("\\s+")) {
            freq.merge(word, 1, Integer::sum);
        }
        System.out.println("Problem 75 Output: " + freq);
    }

    // Problem 76: Collectors.toMap with duplicate key handling
    private static void problem76() {
        List<String> list = Arrays.asList("a","b","a");
        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
        System.out.println("Problem 76 Output: " + map); // {a=2, b=1}
    }

    // Problem 77: Collectors.mapping inside groupingBy
    private static void problem77() {
        class Employee { String dept; String name; Employee(String d,String n){dept=d;name=n;} }
        List<Employee> employees = Arrays.asList(
                new Employee("IT","Alice"), new Employee("IT","Bob"), new Employee("HR","Charlie"));
        Map<String, List<String>> grouped = employees.stream()
                .collect(Collectors.groupingBy(e -> e.dept,
                        Collectors.mapping(e -> e.name, Collectors.toList())));
        System.out.println("Problem 77 Output: " + grouped); // {HR=[Charlie], IT=[Alice, Bob]}
    }

    // Problem 78: Collectors.collectingAndThen (unmodifiable list)
    private static void problem78() {
        List<String> list = Arrays.asList("a","b","c");
        List<String> unmodifiable = list.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        System.out.println("Problem 78 Output: " + unmodifiable);
    }
}
