package collectors;

import java.util.*;
import java.util.stream.*;

public class CollectorsModule {

    public static void main(String[] args) {
        problem95();
        problem96();
        problem97();
        problem98();
        problem99();
        problem100();
        problem101();
        problem102();
        problem103();
        problem104();
        problem105();
        problem106();
    }

    // Problem 95: Collect statistics
    private static void problem95() {
        List<Integer> nums = Arrays.asList(10,20,30,40);
        IntSummaryStatistics stats = nums.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Problem 95 Output: " + stats);
    }

    // Problem 96: Partition list into even/odd
    private static void problem96() {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        Map<Boolean,List<Integer>> partition = nums.stream()
                .collect(Collectors.partitioningBy(n -> n%2==0));
        System.out.println("Problem 96 Output: " + partition);
    }

    // Problem 97: Group employees by dept → highest paid
    private static void problem97() {
        class Emp { String dept; int salary; Emp(String d,int s){dept=d;salary=s;} }
        List<Emp> emps = Arrays.asList(new Emp("IT",5000), new Emp("IT",7000), new Emp("HR",4000));
        Map<String,Optional<Emp>> grouped = emps.stream()
                .collect(Collectors.groupingBy(e->e.dept, Collectors.maxBy(Comparator.comparingInt(e->e.salary))));
        System.out.println("Problem 97 Output: " + grouped);
    }

    // Problem 98: Group employees by dept → average salary
    private static void problem98() {
        class Emp { String dept; int salary; Emp(String d,int s){dept=d;salary=s;} }
        List<Emp> emps = Arrays.asList(new Emp("IT",5000), new Emp("IT",7000), new Emp("HR",4000));
        Map<String,Double> avg = emps.stream()
                .collect(Collectors.groupingBy(e->e.dept, Collectors.averagingInt(e->e.salary)));
        System.out.println("Problem 98 Output: " + avg);
    }

    // Problem 99: Group employees by dept → count
    private static void problem99() {
        class Emp { String dept; Emp(String d){dept=d;} }
        List<Emp> emps = Arrays.asList(new Emp("IT"), new Emp("IT"), new Emp("HR"));
        Map<String,Long> count = emps.stream()
                .collect(Collectors.groupingBy(e->e.dept, Collectors.counting()));
        System.out.println("Problem 99 Output: " + count);
    }

    // Problem 100: Group employees by dept → oldest/youngest
    private static void problem100() {
        class Emp { String dept; int age; Emp(String d,int a){dept=d;age=a;} }
        List<Emp> emps = Arrays.asList(new Emp("IT",30), new Emp("IT",40), new Emp("HR",25));
        Map<String,Optional<Emp>> oldest = emps.stream()
                .collect(Collectors.groupingBy(e->e.dept, Collectors.maxBy(Comparator.comparingInt(e->e.age))));
        System.out.println("Problem 100 Output: " + oldest);
    }

    // Problem 101: Group employees by gender → avg age
    private static void problem101() {
        class Emp { String gender; int age; Emp(String g,int a){gender=g;age=a;} }
        List<Emp> emps = Arrays.asList(new Emp("M",30), new Emp("F",25), new Emp("M",40));
        Map<String,Double> avg = emps.stream()
                .collect(Collectors.groupingBy(e->e.gender, Collectors.averagingInt(e->e.age)));
        System.out.println("Problem 101 Output: " + avg);
    }

    // Problem 102: Group employees by dept → names map
    private static void problem102() {
        class Emp { String dept; String name; Emp(String d,String n){dept=d;name=n;} }
        List<Emp> emps = Arrays.asList(new Emp("IT","Alice"), new Emp("IT","Bob"), new Emp("HR","Charlie"));
        Map<String,List<String>> names = emps.stream()
                .collect(Collectors.groupingBy(e->e.dept, Collectors.mapping(e->e.name, Collectors.toList())));
        System.out.println("Problem 102 Output: " + names);
    }

    // Problem 103: Group students by dept → avg grade
    private static void problem103() {
        class Student { String dept; double grade; Student(String d,double g){dept=d;grade=g;} }
        List<Student> students = Arrays.asList(new Student("CS",8.5), new Student("CS",9.0), new Student("Math",7.5));
        Map<String,Double> avg = students.stream()
                .collect(Collectors.groupingBy(s->s.dept, Collectors.averagingDouble(s->s.grade)));
        System.out.println("Problem 103 Output: " + avg);
    }

    // Problem 104: Group students by dept → count
    private static void problem104() {
        class Student { String dept; Student(String d){dept=d;} }
        List<Student> students = Arrays.asList(new Student("CS"), new Student("CS"), new Student("Math"));
        Map<String,Long> count = students.stream()
                .collect(Collectors.groupingBy(s->s.dept, Collectors.counting()));
        System.out.println("Problem 104 Output: " + count);
    }

    // Problem 105: Group students by grade partition (>8.0)
    private static void problem105() {
        class Student { double grade; Student(double g){grade=g;} }
        List<Student> students = Arrays.asList(new Student(9.0), new Student(7.5), new Student(8.5));
        Map<Boolean,List<Student>> partition = students.stream()
                .collect(Collectors.partitioningBy(s->s.grade>8.0));
        System.out.println("Problem 105 Output: " + partition);
    }

    // Problem 106: Group students by city → filter Hyderabad
    private static void problem106() {
        class Student { String city; Student(String c){city=c;} }
        List<Student> students = Arrays.asList(
                new Student("Hyderabad"),
                new Student("Delhi"),
                new Student("Hyderabad"),
                new Student("Mumbai")
        );

        // Group by city
        Map<String, List<Student>> grouped = students.stream()
                .collect(Collectors.groupingBy(s -> s.city));

        // Filter Hyderabad students
        List<Student> hydStudents = grouped.getOrDefault("Hyderabad", Collections.emptyList());

        System.out.println("Problem 106 Grouped: " + grouped);
        System.out.println("Problem 106 Hyderabad Students: " + hydStudents);
    }
}
