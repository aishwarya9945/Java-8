package scenarios;

import java.util.*;
import java.util.stream.*;

public class ScenariosModule {

    public static void main(String[] args) {
        problem107();
        problem108();
        problem109();
        problem110();
        problem111();
        problem112();
        problem113();
        problem114();
        problem115();
        problem116();
        problem117();
        problem118();
        problem119();
        problem120();
        problem121();
    }

    // Problem 107: Merge two arrays → sorted array
    private static void problem107() {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};
        int[] merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted().toArray();
        System.out.println("Problem 107 Output: " + Arrays.toString(merged));
    }

    // Problem 108: Get top 3 elements from list
    private static void problem108() {
        List<Integer> list = Arrays.asList(10,30,20,50,40);
        List<Integer> top3 = list.stream().sorted(Comparator.reverseOrder())
                .limit(3).collect(Collectors.toList());
        System.out.println("Problem 108 Output: " + top3);
    }

    // Problem 109: Get 3rd highest element
    private static void problem109() {
        List<Integer> list = Arrays.asList(10,30,20,50,40);
        int third = list.stream().sorted(Comparator.reverseOrder())
                .skip(2).findFirst().orElse(-1);
        System.out.println("Problem 109 Output: " + third);
    }

    // Problem 110: Numbers starting with digit “1”
    private static void problem110() {
        List<Integer> list = Arrays.asList(10,21,13,45,19);
        List<Integer> result = list.stream()
                .filter(n -> String.valueOf(n).startsWith("1"))
                .collect(Collectors.toList());
        System.out.println("Problem 110 Output: " + result);
    }

    // Problem 111: Check all/any/none match conditions
    private static void problem111() {
        List<Integer> list = Arrays.asList(2,4,6,8);
        boolean allEven = list.stream().allMatch(n -> n%2==0);
        boolean anyGreater5 = list.stream().anyMatch(n -> n>5);
        boolean noneNegative = list.stream().noneMatch(n -> n<0);
        System.out.println("Problem 111 Output: allEven=" + allEven + ", any>5=" + anyGreater5 + ", noneNegative=" + noneNegative);
    }

    // Problem 112: Check if list is sorted
    private static void problem112() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        boolean sorted = IntStream.range(0,list.size()-1)
                .allMatch(i -> list.get(i) <= list.get(i+1));
        System.out.println("Problem 112 Output: " + sorted);
    }

    // Problem 113: Rotate list by N positions
    private static void problem113() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int n = 2;
        List<Integer> rotated = Stream.concat(list.stream().skip(n), list.stream().limit(n))
                .collect(Collectors.toList());
        System.out.println("Problem 113 Output: " + rotated);
    }

    // Problem 114: Find longest string in list
    private static void problem114() {
        List<String> list = Arrays.asList("Java","SpringBoot","Microservices");
        String longest = list.stream().max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println("Problem 114 Output: " + longest);
    }

    // Problem 115: Find strings longer than given length
    private static void problem115() {
        List<String> list = Arrays.asList("Java","SpringBoot","Microservices");
        List<String> result = list.stream().filter(s -> s.length()>5).collect(Collectors.toList());
        System.out.println("Problem 115 Output: " + result);
    }

    // Problem 116: Convert list → comma separated string
    private static void problem116() {
        List<String> list = Arrays.asList("Java","Spring","Boot");
        String joined = list.stream().collect(Collectors.joining(", "));
        System.out.println("Problem 116 Output: " + joined);
    }

    // Problem 117: Split CSV → sorted list
    private static void problem117() {
        String csv = "banana,apple,grape";
        List<String> sorted = Arrays.stream(csv.split(","))
                .sorted().collect(Collectors.toList());
        System.out.println("Problem 117 Output: " + sorted);
    }

    // Problem 118: Distinct elements preserving order
    private static void problem118() {
        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);
        List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Problem 118 Output: " + distinct);
    }

    // Problem 119: Find salaries grouped by dept (sum)
    private static void problem119() {
        class Emp { String dept; int salary; Emp(String d,int s){dept=d;salary=s;} }
        List<Emp> emps = Arrays.asList(new Emp("IT",5000), new Emp("IT",7000), new Emp("HR",4000));
        Map<String,Integer> sum = emps.stream()
                .collect(Collectors.groupingBy(e->e.dept, Collectors.summingInt(e->e.salary)));
        System.out.println("Problem 119 Output: " + sum);
    }

    // Problem 120: Find union & intersection of sets
    private static void problem120() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,6));
        Set<Integer> union = new HashSet<>(set1); union.addAll(set2);
        Set<Integer> intersection = new HashSet<>(set1); intersection.retainAll(set2);
        System.out.println("Problem 120 Union: " + union + ", Intersection: " + intersection);
    }

    // Problem 121: Find all pairs summing to target
    private static void problem121() {
        List<Integer> list = Arrays.asList(2,4,3,5,7);
        int target = 7;
        List<String> pairs = list.stream()
                .flatMap(i -> list.stream().filter(j -> i+j==target).map(j -> i+"+"+j))
                .collect(Collectors.toList());
        System.out.println("Problem 121 Output: " + pairs);
    }
}
