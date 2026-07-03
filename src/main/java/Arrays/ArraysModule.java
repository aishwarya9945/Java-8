package src.main.java.Arrays;

import java.util.*;
import java.util.stream.*;

public class ArraysModule {

    public static void main(String[] args) {
        problem46();
        problem47();
        problem48();
        problem49();
        problem50();
        problem51();
        problem52();
        problem53();
        problem54();
        problem55();
        problem56();
        problem57();
        problem58();
        problem59();
        problem60();
        problem61();
        problem62();
        problem63();
        problem64();
        problem65();
    }

    // Problem 46: Remove duplicates
    private static void problem46() {
        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);
        List<Integer> unique = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Problem 46 Output: " + unique);
    }

    // Problem 47: Sort ascending / descending
    private static void problem47() {
        List<Integer> list = Arrays.asList(5,2,8,1);
        List<Integer> asc = list.stream().sorted().collect(Collectors.toList());
        List<Integer> desc = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Problem 47 Asc: " + asc);
        System.out.println("Problem 47 Desc: " + desc);
    }

    // Problem 48: Find first element
    private static void problem48() {
        List<String> list = Arrays.asList("A","B","C");
        String first = list.stream().findFirst().orElse("Empty");
        System.out.println("Problem 48 Output: " + first);
    }

    // Problem 49: Skip N elements
    private static void problem49() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> skipped = list.stream().skip(2).collect(Collectors.toList());
        System.out.println("Problem 49 Output: " + skipped);
    }

    // Problem 50: Limit first N elements
    private static void problem50() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> limited = list.stream().limit(3).collect(Collectors.toList());
        System.out.println("Problem 50 Output: " + limited);
    }

    // Problem 51: Rotate list by N positions
    private static void problem51() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int n = 2;
        List<Integer> rotated = Stream.concat(list.stream().skip(n), list.stream().limit(n))
                .collect(Collectors.toList());
        System.out.println("Problem 51 Output: " + rotated);
    }

    // Problem 52: Partition list into even/odd
    private static void problem52() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Map<Boolean, List<Integer>> partition = list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Problem 52 Even: " + partition.get(true));
        System.out.println("Problem 52 Odd: " + partition.get(false));
    }

    // Problem 53: Filter strings by length
    private static void problem53() {
        List<String> list = Arrays.asList("Java","Spring","Boot","Microservices");
        List<String> filtered = list.stream().filter(s -> s.length() >= 5).collect(Collectors.toList());
        System.out.println("Problem 53 Output: " + filtered);
    }

    // Problem 54: Remove nulls
    private static void problem54() {
        List<String> list = Arrays.asList("A", null, "B", null, "C");
        List<String> cleaned = list.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println("Problem 54 Output: " + cleaned);
    }

    // Problem 55: Remove empty/blank strings
    private static void problem55() {
        List<String> list = Arrays.asList("Java"," ","","Spring");
        List<String> cleaned = list.stream().filter(s -> s != null && !s.trim().isBlank()).collect(Collectors.toList());
        System.out.println("Problem 55 Output: " + cleaned);
    }

    // Problem 56: Find common elements between two lists
    private static void problem56() {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(3,4,5,6);
        List<Integer> common = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println("Problem 56 Output: " + common);
    }

    // Problem 57: Find difference between two lists
    private static void problem57() {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(3,4,5,6);
        List<Integer> diff = list1.stream().filter(n -> !list2.contains(n)).collect(Collectors.toList());
        System.out.println("Problem 57 Output: " + diff);
    }

    // Problem 58: Find numbers appearing exactly once
    private static void problem58() {
        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);
        List<Integer> once = list.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("Problem 58 Output: " + once);
    }

    // Problem 59: Convert list → squares
    private static void problem59() {
        List<Integer> list = Arrays.asList(1,2,3,4);
        List<Integer> squares = list.stream().map(n -> n*n).collect(Collectors.toList());
        System.out.println("Problem 59 Output: " + squares);
    }

    // Problem 60: Find longest consecutive sequence
    private static void problem60() {
        List<Integer> list = Arrays.asList(100,4,200,1,3,2);
        Set<Integer> set = new HashSet<>(list);
        int longest = 0;
        for (int num : set) {
            if (!set.contains(num-1)) {
                int current = num;
                int streak = 1;
                while (set.contains(current+1)) {
                    current++;
                    streak++;
                }
                longest = Math.max(longest, streak);
            }
        }
        System.out.println("Problem 60 Output: " + longest); // 4
    }

    // Problem 61: Rotate array (reverse trick)
    private static void problem61() {
        int[] arr = {1,2,3,4,5};
        int n = 2;
        Collections.reverse(Arrays.asList(arr)); // simplified for demo
        System.out.println("Problem 61 Output: " + Arrays.toString(arr));
    }

    // Problem 62: Move zeroes to end
    private static void problem62() {
        int[] arr = {0,1,0,3,12};
        int index = 0;
        for (int num : arr) if (num != 0) arr[index++] = num;
        while (index < arr.length) arr[index++] = 0;
        System.out.println("Problem 62 Output: " + Arrays.toString(arr));
    }

    // Problem 63: Sort colors (Dutch flag)
    private static void problem63() {
        int[] arr = {2,0,2,1,1,0};
        int low=0, mid=0, high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){int tmp=arr[low];arr[low++]=arr[mid];arr[mid++]=tmp;}
            else if(arr[mid]==1){mid++;}
            else{int tmp=arr[mid];arr[mid]=arr[high];arr[high--]=tmp;}
        }
        System.out.println("Problem 63 Output: " + Arrays.toString(arr));
    }

    // Problem 64: Sort array by parity
    private static void problem64() {
        int[] arr = {3,1,2,4};
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]%2>arr[j]%2){
                int tmp=arr[i];arr[i]=arr[j];arr[j]=tmp;
            }
            if(arr[i]%2==0)i++;
            if(arr[j]%2==1)j--;
        }
        System.out.println("Problem 64 Output: " + Arrays.toString(arr));
    }

    // Problem 65: Remove element from array
    private static void problem65() {
        int[] arr = {3,2,2,3};
        int val = 3;
        int index = 0;

        // Overwrite elements that are not equal to val
        for (int num : arr) {
            if (num != val) {
                arr[index++] = num;
            }
        }

        // Create a new array with the valid length
        int[] result = Arrays.copyOf(arr, index);
        System.out.println("Problem 65 Output: " + Arrays.toString(result)); // [2, 2]
    }
}
