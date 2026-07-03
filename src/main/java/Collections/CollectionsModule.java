package src.main.java.Collections;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsModule {

    public static void main(String[] args) {
        // Call each problem method
        problem1();
        problem2();
        problem3();
        problem4();
        problem5();
        problem6();
        problem7();
        problem8();
        problem9();
        problem10();
        problem11();
        problem12();
    }

    // Problem 1: Convert List → Set
    private static void problem1() {
        List<Integer> list1 = Arrays.asList(1, 2, 2, 3, 3, 4);
        Set<Integer> set1 = new HashSet<>(list1);
        System.out.println("Problem 1 Output: " + set1); // [1, 2, 3, 4]
    }

    // Problem 2: Convert List → LinkedHashSet (preserve order)
    private static void problem2() {
        List<Integer> list2 = Arrays.asList(3, 1, 2, 1, 3);
        Set<Integer> set2 = list2.stream()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("Problem 2 Output: " + set2); // [3, 1, 2]
    }

    // Problem 3: Convert Set → List
    private static void problem3() {
        Set<String> set3 = new HashSet<>(Arrays.asList("banana", "apple", "cherry"));
        List<String> list3 = new ArrayList<>(set3);
        System.out.println("Problem 3 Output: " + list3);
    }

    // Problem 4: Convert Set → Sorted List
    private static void problem4() {
        Set<Integer> set4 = new HashSet<>(Arrays.asList(5, 3, 1, 4, 2));
        List<Integer> sortedList = set4.stream().sorted().collect(Collectors.toList());
        System.out.println("Problem 4 Output: " + sortedList); // [1, 2, 3, 4, 5]
    }

    // Problem 5: Convert List → Map (word → length)
    private static void problem5() {
        List<String> words = Arrays.asList("apple", "banana", "kiwi");
        Map<String, Integer> map1 = words.stream()
                .collect(Collectors.toMap(w -> w, String::length));
        System.out.println("Problem 5 Output: " + map1); // {apple=5, banana=6, kiwi=4}
    }

    // Problem 6: Convert Map → List of keys and values
    private static void problem6() {
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Alice", 90);
        map2.put("Bob", 85);
        List<String> keys = new ArrayList<>(map2.keySet());
        List<Integer> values = new ArrayList<>(map2.values());
        System.out.println("Problem 6 Output Keys: " + keys);   // [Alice, Bob]
        System.out.println("Problem 6 Output Values: " + values); // [90, 85]
    }

    // Problem 7: Merge two lists into Map
    private static void problem7() {
        List<String> keysList = Arrays.asList("a", "b", "c");
        List<Integer> valuesList = Arrays.asList(1, 2, 3);
        Map<String, Integer> mergedMap =
                java.util.stream.IntStream.range(0, keysList.size())
                        .boxed()
                        .collect(Collectors.toMap(keysList::get, valuesList::get));
        System.out.println("Problem 7 Output: " + mergedMap); // {a=1, b=2, c=3}
    }

    // Problem 8: Merge two maps (handle duplicates)
    private static void problem8() {
        Map<String, Integer> mapA = new HashMap<>();
        mapA.put("Alice", 90);
        mapA.put("Bob", 80);
        Map<String, Integer> mapB = new HashMap<>();
        mapB.put("Bob", 95); // duplicate key
        mapB.put("Charlie", 85);
        Map<String, Integer> merged = new HashMap<>(mapA);
        mapB.forEach((k, v) -> merged.merge(k, v, Integer::max));
        System.out.println("Problem 8 Output: " + merged); // {Alice=90, Bob=95, Charlie=85}
    }

    // Problem 9: Convert array → List → Stream ops
    private static void problem9() {
        String[] arr = {"apple", "banana", "apple", "grape"};
        List<String> unique = Arrays.stream(arr).distinct().collect(Collectors.toList());
        System.out.println("Problem 9 Output: " + unique); // [apple, banana, grape]
    }

    // Problem 10: Convert primitive array → Stream
    private static void problem10() {
        int[] arr2 = {1, 2, 3, 4};
        int sum = Arrays.stream(arr2).sum();
        System.out.println("Problem 10 Output: " + sum); // 10
    }

    // Problem 11: Convert List → comma-separated String
    private static void problem11() {
        List<String> list11 = Arrays.asList("Java", "Spring", "Boot");
        String joined = String.join(", ", list11);
        System.out.println("Problem 11 Output: " + joined); // Java, Spring, Boot
    }

    // Problem 12: Convert List<Integer> → comma-separated String
    private static void problem12() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        String str = numbers.stream().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println("Problem 12 Output: " + str); // 1, 2, 3, 4, 5
    }
}
