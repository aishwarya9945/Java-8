package src.main.java.Numbers;

import java.util.*;
import java.util.stream.*;

public class NumbersModule {

    public static void main(String[] args) {
        problem13();
        problem14();
        problem15();
        problem16();
        problem17();
        problem18();
        problem19();
        problem20();
        problem21();
        problem22();
        problem23();
        problem24();
        problem25();
    }

    // Problem 13: Sum of digits in a number
    private static void problem13() {
        int num = 1234;
        int sum = String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        System.out.println("Problem 13 Output: " + sum); // 10
    }

    // Problem 14: Reverse a number
    private static void problem14() {
        int num = 1234;
        int reversed = Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
        System.out.println("Problem 14 Output: " + reversed); // 4321
    }

    // Problem 15: Check if number is prime
    private static void problem15() {
        int num = 29;
        boolean isPrime = IntStream.rangeClosed(2, (int)Math.sqrt(num))
                .allMatch(i -> num % i != 0);
        System.out.println("Problem 15 Output: " + isPrime); // true
    }

    // Problem 16: Factorial of a number
    private static void problem16() {
        int num = 5;
        long fact = LongStream.rangeClosed(1, num).reduce(1, (a, b) -> a * b);
        System.out.println("Problem 16 Output: " + fact); // 120
    }

    // Problem 17: Fibonacci series up to N terms
    private static void problem17() {
        int n = 7;
        List<Integer> fib = new ArrayList<>(Arrays.asList(0, 1));
        IntStream.range(2, n).forEach(i -> fib.add(fib.get(i-1) + fib.get(i-2)));
        System.out.println("Problem 17 Output: " + fib); // [0, 1, 1, 2, 3, 5, 8]
    }

    // Problem 18: Largest of three numbers
    private static void problem18() {
        int a = 10, b = 25, c = 15;
        int max = Stream.of(a, b, c).max(Integer::compare).get();
        System.out.println("Problem 18 Output: " + max); // 25
    }

    // Problem 19: Smallest of three numbers
    private static void problem19() {
        int a = 10, b = 25, c = 15;
        int min = Stream.of(a, b, c).min(Integer::compare).get();
        System.out.println("Problem 19 Output: " + min); // 10
    }

    // Problem 20: Armstrong number check
    private static void problem20() {
        int num = 153;
        int sum = String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .map(d -> d*d*d)
                .sum();
        System.out.println("Problem 20 Output: " + (sum == num)); // true
    }

    // Problem 21: Palindrome number check
    private static void problem21() {
        int num = 121;
        boolean isPalindrome = String.valueOf(num)
                .equals(new StringBuilder(String.valueOf(num)).reverse().toString());
        System.out.println("Problem 21 Output: " + isPalindrome); // true
    }

    // Problem 22: Sum of even numbers in a list
    private static void problem22() {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        int sumEven = nums.stream().filter(n -> n%2==0).mapToInt(Integer::intValue).sum();
        System.out.println("Problem 22 Output: " + sumEven); // 12
    }

    // Problem 23: Sum of odd numbers in a list
    private static void problem23() {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        int sumOdd = nums.stream().filter(n -> n%2!=0).mapToInt(Integer::intValue).sum();
        System.out.println("Problem 23 Output: " + sumOdd); // 9
    }

    // Problem 24: Average of numbers in a list
    private static void problem24() {
        List<Integer> nums = Arrays.asList(10,20,30,40);
        double avg = nums.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Problem 24 Output: " + avg); // 25.0
    }

    // Problem 25: Square root of a number
    private static void problem25() {
        int num = 81;
        double sqrt = Math.sqrt(num);
        System.out.println("Problem 25 Output: " + sqrt); // 9.0
    }
}
