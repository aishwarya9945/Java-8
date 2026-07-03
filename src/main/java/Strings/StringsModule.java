package src.main.java.Strings;

import java.util.*;
import java.util.stream.*;

public class StringsModule {

    public static void main(String[] args) {
        problem26();
        problem27();
        problem28();
        problem29();
        problem30();
        problem31();
        problem32();
        problem33();
        problem34();
        problem35();
        problem36();
        problem37();
        problem38();
        problem39();
        problem40();
        problem41();
        problem42();
        problem43();
        problem44();
        problem45();
    }

    // Problem 26: Reverse a string
    private static void problem26() {
        String str = "hello";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Problem 26 Output: " + reversed); // olleh
    }

    // Problem 27: Check palindrome string
    private static void problem27() {
        String str = "madam";
        boolean isPalindrome = str.equals(new StringBuilder(str).reverse().toString());
        System.out.println("Problem 27 Output: " + isPalindrome); // true
    }

    // Problem 28: Count vowels in a string
    private static void problem28() {
        String str = "education";
        long count = str.chars()
                .mapToObj(c -> (char)c)
                .filter(ch -> "aeiou".indexOf(ch) >= 0)
                .count();
        System.out.println("Problem 28 Output: " + count); // 5
    }

    // Problem 29: Count consonants in a string
    private static void problem29() {
        String str = "education";
        long count = str.chars()
                .mapToObj(c -> (char)c)
                .filter(ch -> Character.isLetter(ch) && "aeiou".indexOf(ch) < 0)
                .count();
        System.out.println("Problem 29 Output: " + count); // 5
    }

    // Problem 30: Find duplicate characters
    private static void problem30() {
        String str = "programming";
        Map<Character, Long> freq = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        freq.entrySet().stream().filter(e -> e.getValue() > 1)
                .forEach(e -> System.out.println("Problem 30 Duplicate: " + e.getKey()));
    }

    // Problem 31: Remove whitespace
    private static void problem31() {
        String str = "Java Spring Boot";
        String noSpace = str.replaceAll("\\s+", "");
        System.out.println("Problem 31 Output: " + noSpace); // JavaSpringBoot
    }

    // Problem 32: Count words in a string
    private static void problem32() {
        String str = "Java Spring Boot Microservices";
        int count = str.split("\\s+").length;
        System.out.println("Problem 32 Output: " + count); // 4
    }

    // Problem 33: Find longest word
    private static void problem33() {
        String str = "Java Spring Boot Microservices";
        String longest = Arrays.stream(str.split("\\s+"))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("Problem 33 Output: " + longest); // Microservices
    }

    // Problem 34: Find shortest word
    private static void problem34() {
        String str = "Java Spring Boot Microservices";
        String shortest = Arrays.stream(str.split("\\s+"))
                .min(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("Problem 34 Output: " + shortest); // Java
    }

    // Problem 35: Count frequency of each word
    private static void problem35() {
        String str = "apple banana apple grape";
        Map<String, Long> freq = Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println("Problem 35 Output: " + freq); // {apple=2, banana=1, grape=1}
    }

    // Problem 36: Anagram check
    private static void problem36() {
        String s1 = "listen", s2 = "silent";
        boolean isAnagram = s1.chars().sorted().boxed().collect(Collectors.toList())
                .equals(s2.chars().sorted().boxed().collect(Collectors.toList()));
        System.out.println("Problem 36 Output: " + isAnagram); // true
    }

    // Problem 37: Remove duplicates from string
    private static void problem37() {
        String str = "programming";
        String unique = str.chars().distinct()
                .mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.joining());
        System.out.println("Problem 37 Output: " + unique); // progamin
    }

    // Problem 38: First non-repeated character
    private static void problem38() {
        String str = "swiss";
        Optional<Character> first = str.chars()
                .mapToObj(c -> (char)c)
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .findFirst();
        System.out.println("Problem 38 Output: " + first.orElse(' ')); // w
    }

    // Problem 39: Character frequency
    private static void problem39() {
        String str = "banana";
        Map<Character, Long> freq = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("Problem 39 Output: " + freq); // {b=1, a=3, n=2}
    }

    // Problem 40: String rotation check
    private static void problem40() {
        String s1 = "abcde", s2 = "cdeab";
        boolean isRotation = (s1.length() == s2.length()) && (s1+s1).contains(s2);
        System.out.println("Problem 40 Output: " + isRotation); // true
    }

    // Problem 41: Reverse words in a string
    private static void problem41() {
        String str = "Java Spring Boot";
        String reversedWords = Arrays.stream(str.split("\\s+"))
                .map(w -> new StringBuilder(w).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("Problem 41 Output: " + reversedWords); // avaJ gnirpS tooB
    }

    // Problem 42: Capitalize each word
    private static void problem42() {
        String str = "java spring boot";
        String capitalized = Arrays.stream(str.split("\\s+"))
                .map(w -> Character.toUpperCase(w.charAt(0)) + w.substring(1))
                .collect(Collectors.joining(" "));
        System.out.println("Problem 42 Output: " + capitalized); // Java Spring Boot
    }

    // Problem 43: Check substring
    private static void problem43() {
        String str = "Java Spring Boot";
        boolean contains = str.contains("Spring");
        System.out.println("Problem 43 Output: " + contains); // true
    }

    // Problem 44: Replace substring
    private static void problem44() {
        String str = "I love Java";
        String replaced = str.replace("Java", "Spring");
        System.out.println("Problem 44 Output: " + replaced); // I love Spring
    }

    // Problem 45: String to char array
    private static void problem45() {
        String str = "hello";
        char[] arr = str.toCharArray();
        System.out.println("Problem 45 Output: " + Arrays.toString(arr)); // [h, e, l, l, o]
    }
}
