# Java-8

Problem #,Title,Category,Status,Notes
1,Convert List → Set,Collections,Pending,
2,Convert List → LinkedHashSet,Collections,Pending,Preserve order
3,Convert Set → List,Collections,Pending,
4,Convert Set → Sorted List,Collections,Pending,
5,Convert List → Map (word → length),Collections,Pending,
6,Convert Map → List of keys/values,Collections,Pending,
7,Merge two lists into Map,Collections,Pending,
8,Merge two maps (handle duplicates),Collections,Pending,Use merge()
9,Convert array → List → Stream ops,Collections,Pending,
10,Convert primitive array → Stream,Collections,Pending,Arrays.stream()
11,Convert List → comma-separated String,Collections,Pending,Collectors.joining()
12,Convert List<Integer> → comma-separated String,Collections,Pending,
13,Find Max element in List,Numbers,Pending,
14,Find Min element in List,Numbers,Pending,
15,Find Sum of numbers,Numbers,Pending,reduce / sum()
16,Find Average of numbers,Numbers,Pending,averagingInt
17,Find nth Largest element,Numbers,Pending,skip(n-1)
18,Find 2nd Largest element,Numbers,Pending,distinct + skip
19,Find Factorial using IntStream,Numbers,Pending,reduce(Long::multiply)
20,Generate Fibonacci series,Numbers,Pending,Stream.iterate
21,Generate multiples of N,Numbers,Pending,Stream.iterate
22,Find Prime numbers up to N,Numbers,Pending,IntStream.filter
23,Sum of digits of a number,Numbers,Pending,String.chars()
24,Cube/filter numbers > 50,Numbers,Pending,map + filter
25,Max Product of two elements,Numbers,Pending,Double loop via IntStream
26,Reverse each word in sentence,Strings,Pending,StringBuilder.reverse()
27,Reverse entire sentence,Strings,Pending,StringBuilder.reverse()
28,Find duplicate characters in string,Strings,Pending,groupingBy + counting
29,Find distinct characters in string,Strings,Pending,chars().distinct()
30,Find first non-repeating character,Strings,Pending,LinkedHashMap + groupingBy
31,Find most frequent character,Strings,Pending,groupingBy + counting
32,Check if two strings are anagrams,Strings,Pending,sort or frequency array
33,Group anagrams together,Strings,Pending,Arrays.sort(char[])
34,Group strings by first character & count,Strings,Pending,groupingBy w.charAt(0)
35,Find longest word in sentence,Strings,Pending,Comparator.comparingInt
36,Find top 3 longest words,Strings,Pending,limit(3)
37,Sort words by length (asc/desc),Strings,Pending,Comparator.comparingInt
38,Word with most vowels,Strings,Pending,filter vowels + count
39,Extract words with numbers,Strings,Pending,regex .*\\d.*
40,Clean sentence & count words,Strings,Pending,replaceAll + split
41,Count vowels in string,Strings,Pending,str.chars().filter()
42,Remove vowels from string,Strings,Pending,filter not in "aeiou"
43,Reverse each word using streams,Strings,Pending,StringBuilder.reverse()
44,Palindrome words in sentence,Strings,Pending,equalsIgnoreCase(reverse)
45,Check if two strings are anagrams (stream sort),Strings,Pending,chars().sorted()
46,Remove duplicates,Arrays,Pending,distinct()
47,Sort ascending / descending,Arrays,Pending,sorted() / reverseOrder()
48,Find first element,Arrays,Pending,findFirst()
49,Skip N elements,Arrays,Pending,skip(n)
50,Limit first N elements,Arrays,Pending,limit(n)
51,Rotate list by N positions,Arrays,Pending,Stream.concat(skip,limit)
52,Partition list into even/odd,Arrays,Pending,partitioningBy(n%2==0)
53,Filter strings by length,Arrays,Pending,filter(s.length()>=n)
54,Remove nulls from list,Arrays,Pending,Objects::nonNull
55,Remove empty/blank strings,Arrays,Pending,trim + isBlank
56,Find common elements between two lists,Arrays,Pending,filter(set::contains)
57,Find difference between two lists,Arrays,Pending,!set.contains()
58,Find numbers appearing exactly once,Arrays,Pending,counting()==1
59,Convert list → squares,Arrays,Pending,map(n->n*n)
60,Find longest consecutive sequence,Arrays,Pending,sort + scan
61,Rotate array (reverse trick),Arrays,Pending,Reverse subarrays
62,Move zeroes to end,Arrays,Pending,Two-pointer approach
63,Sort colors (Dutch flag),Arrays,Pending,Three-way partition
64,Sort array by parity,Arrays,Pending,Two-pointer swap
65,Remove element from array,Arrays,Pending,Filter or overwrite
66,Count frequency of words in sentence,Maps,Pending,groupingBy + counting
67,Count frequency of characters,Maps,Pending,chars().mapToObj()
68,Find most frequent element in list,Maps,Pending,max by value
69,Top K frequent elements,Maps,Pending,minHeap size k
70,Frequency of words in string,Maps,Pending,merge or groupingBy
71,Find duplicate words in sentence,Maps,Pending,filter count>1
72,Filter map by value,Maps,Pending,entrySet().stream().filter()
73,Sort map by value (descending),Maps,Pending,LinkedHashMap collector
74,Map.computeIfAbsent → list valued map,Maps,Pending,grouped lists
75,Map.merge → count frequencies,Maps,Pending,Integer::sum
76,Collectors.toMap with duplicate key handling,Maps,Pending,merge function
77,Collectors.mapping inside groupingBy,Maps,Pending,names by dept
78,Collectors.collectingAndThen (unmodifiable list),Maps,Pending,Collections.unmodifiableList
79,Flatten nested list → distinct sorted elements,Streams,Pending,flatMap + distinct
80,FlatMap sentences → unique words,Streams,Pending,flatMap split
81,FlatMap list of lists → single list,Streams,Pending,flatMap(List::stream)
82,FlatMap employees → unique skills,Streams,Pending,flatMap(e.getSkills())
83,Reduce → concatenate strings,Streams,Pending,reduce("", (a,b)->a+" "+b)
84,Reduce → longest common prefix,Streams,Pending,reduce substring
85,Reduce → sum/max,Streams,Pending,reduce(Integer::sum)
86,Peek() for debugging pipeline,Streams,Pending,peek before/after filter
87,Parallel streams (when to use/avoid),Streams,Pending,large data only
88,Optional → avoid NPE,Streams,Pending,Optional.ofNullable
89,Optional.ifPresent / ifPresentOrElse,Streams,Pending,Java 9 feature
90,Optional → Stream conversion,Streams,Pending,filter Optional::isPresent
Problem #,Title,Category,Status,Notes
91,Chain multiple Predicates,Functions,Pending,and / or chaining
92,Function.andThen vs Function.compose,Functions,Pending,doubleIt.andThen(addTen)
93,Consumer.andThen chaining,Functions,Pending,print.andThen(toUpper)
94,Supplier → lazy object creation,Functions,Pending,ArrayList::new
95,Collect statistics (min, max, avg, sum, count),Collectors,Pending,summarizingInt
96,Partition list into even/odd,Collectors,Pending,partitioningBy(n%2==0)
97,Group employees by dept → highest paid,Collectors,Pending,maxBy comparator
98,Group employees by dept → average salary,Collectors,Pending,summingDouble
99,Group employees by dept → count,Collectors,Pending,counting()
100,Group employees by dept → oldest/youngest,Collectors,Pending,maxBy/minBy
101,Group employees by gender → avg age,Collectors,Pending,groupingBy gender
102,Group employees by dept → names map,Collectors,Pending,mapping(Employee::getName)
103,Group students by dept → avg grade,Collectors,Pending,averagingDouble
104,Group students by dept → count,Collectors,Pending,counting()
105,Group students by grade partition (>8.0),Collectors,Pending,partitioningBy
106,Group students by city → filter Hyderabad,Collectors,Pending,filter(city=="Hyderabad")
107,Merge two arrays → sorted array,Scenarios,Pending,Stream.concat + sorted
108,Get top 3 elements from list,Scenarios,Pending,sorted(reverseOrder).limit(3)
109,Get 3rd highest element from list,Scenarios,Pending,skip(2).findFirst()
110,Numbers starting with digit “1”,Scenarios,Pending,String.valueOf().startsWith("1")
111,Check all/any/none match conditions,Scenarios,Pending,allMatch/anyMatch/noneMatch
112,Check if list is sorted,Scenarios,Pending,IntStream.range check
113,Rotate list by N positions,Scenarios,Pending,Stream.concat(skip,limit)
114,Find longest string in list,Scenarios,Pending,max by length
115,Find strings longer than given length,Scenarios,Pending,filter(w.length()>n)
116,Convert list → comma separated string,Scenarios,Pending,Collectors.joining(", ")
117,Split CSV → sorted list,Scenarios,Pending,split(",").sorted()
118,Distinct elements preserving order,Scenarios,Pending,distinct()
119,Find salaries grouped by dept (sum),Scenarios,Pending,summingDouble
120,Find union & intersection of sets,Scenarios,Pending,filter(set2::contains)
121,Find all pairs summing to target,Scenarios,Pending,flatMap + filter
