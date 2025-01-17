package com.example;

import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Collections.max;


public class LambdaUse {

    public void lambdaUse(){
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
       List<Integer> l1 =   l.stream().filter(num -> num % 20 != 0).collect(Collectors.toList());
        System.out.println(l1);
//      int al =  l.stream().map(num -> num * num).reduce(0,Integer::sum);
//        int al =  l.stream().map(num -> num * num).reduce(0, (a, b) -> a + b);
        OptionalDouble al = l.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).average();


        System.out.println(al);
    }


    public void sumOfEvenNumbers(){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<100;i++){
            al.add(i);
        }

        Integer reduce = al.stream().filter(num -> (num % 2) == 0).reduce(0, (a, b) -> a + b);
        long count = al.stream().filter(num -> num % 2 != 0).count();
        System.out.println(count);
    }

    public void stringLength(){
        ArrayList<String> l = new ArrayList<>();
        l.add("aman");
        l.add("deepak");
        l.add("ravi");
        l.add("akash");
        l.add("abhinaw");
        l.add("ram");

     List<String> la =   l.stream().filter(str -> str.length()>5).collect(Collectors.toList());
        System.out.println(la);

    }

    public void removeDuplicates(){
        ArrayList<Integer> al =  new ArrayList<>();
        al.add(2);
        al.add(1);
        al.add(3);
        al.add(2);
        al.add(1);
        al.add(1);
        al.add(4);
        al.add(1);

      long l = al.stream().distinct().count();
        System.out.println(l);
    }

    public void firstEven(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(7);
        l.add(2);
        l.add(4);
        l.add(6);
        l.add(9);

        Optional<Integer> first = l.stream().filter(num -> num % 2 == 0).findFirst();
        System.out.println(first);
    }

    public void sumOfLengthOfAllString(){
        ArrayList<String> l = new ArrayList<>();
        l.add("amandeep");
        l.add("deepak");
        l.add("ravi");
        l.add("akash");
        l.add("abhinaw");
        l.add("ram");

        List<Integer> collect = l.stream().map(str -> str.length()).collect(Collectors.toList());
        System.out.println(collect);
    }


    public void flatMapUse(){
        List<List<String>> l = List.of(
                List.of("amandeep", "deepak", "ravi"),
                List.of("akash", "abhinaw", "ram"),
                List.of("john", "doe")
        );

        List<String> collect = l.stream().flatMap(List::stream).collect(Collectors.toList());
        collect.forEach(innerList -> System.out.println(innerList));

    }

    public void partitionEvenOdd(){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<=50;i++){
            al.add(i);
        }
        Map<Boolean, List<Integer>> collect = al.stream().collect(Collectors.partitioningBy(num -> (num % 2 == 0)));
            for(boolean set : collect.keySet()){
                System.out.println(collect.get(set));
            }
    }

    public void secondLargest(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(3);
        l.add(6);
        l.add(7);
        l.add(11);
        l.add(12);

         l.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1)
                 .forEach(System.out::println);
//        System.out.println(secondLargest);
    }

    public void lastElementOfArray(){
       int arr[] = new int[5];
       Scanner s =new Scanner(System.in);
       for(int i=0;i<5;i++){
           arr[i] = s.nextInt();
       }

       //first way to find the last element
        OptionalInt lastElement1 = Arrays.stream(arr).reduce((first, last) -> last);
        System.out.println(lastElement1);


        OptionalInt lastElement = Arrays.stream(arr).skip(arr.length - 1).findFirst();
        System.out.println(lastElement);
    }

    public void frequency(){
        String input = "success";

        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequencyMap);
    }

    public void reverse(){
       String str = "Abhinaw";
        String result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            StringBuilder sb = new StringBuilder();
                            for (int i = list.size() - 1; i >= 0; i--) {
                                sb.append(list.get(i));
                            }
                            return sb.toString();
                        }
                ));
        System.out.println(result);
    }

    public void multipleOfFive(){
        ArrayList<Integer> al =  new ArrayList<>();
        al.add(2);
        al.add(10);
        al.add(35);
        al.add(2);
        al.add(15);
        al.add(1);
        al.add(40);
        al.add(1);

       List<Integer> result = al.stream().filter(num -> num % 5 ==0).collect(Collectors.toList());
        System.out.println(result);
    }

    public void maximum(){
        ArrayList<Integer> al =  new ArrayList<>();
        al.add(2);
        al.add(10);
        al.add(35);
        al.add(2);
        al.add(15);
        al.add(1);
        al.add(40);
        al.add(1);

        Integer maximum = al.stream().max(Comparator.naturalOrder()).orElseThrow(() -> new RuntimeException("No such element"));
        System.out.println(maximum);

//        al.stream().sorted(Comparator.reverseOrder()).limit(1)
//                .forEach(System.out::println);
    }

    public void sortListOfString(){
        ArrayList<String> l = new ArrayList<>();
        l.add("amandeep");
        l.add("deepak");
        l.add("ravi");
        l.add("akash");
        l.add("abhinaw");
        l.add("ram");
        l.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }

    public void minimum(){
        ArrayList<Integer> al =  new ArrayList<>();
        al.add(2);
        al.add(10);
        al.add(35);
        al.add(2);
        al.add(15);
        al.add(1);
        al.add(40);
        al.add(1);
        al.add(0);
        al.add(91);

        Integer rs = al.stream().min(Comparator.naturalOrder()).orElseThrow(() ->
                new RuntimeException("No such element"));
        System.out.println(rs);
//        al.stream().sorted().limit(1).forEach(System.out::println);
    }

    public void sumOfAll(){
        ArrayList<Integer> al =  new ArrayList<>();
        al.add(2);
        al.add(10);
        al.add(35);
        al.add(2);
        al.add(15);

        Integer result = al.stream().reduce((a, b) -> a + b).get();
        System.out.println(result);
    }

    public void commonBetweenTwoArray(){
        int arr1[] = {2,3,6,1,9};
        int arr2[] = {8,7,0,5,3};

        Arrays.stream(arr1).filter(i -> Arrays.stream(arr2).anyMatch(x -> x == i))
                .forEach(System.out::println);
    }

    public void reverseEachWordOfString(){
        String input = "My name is abhinaw baibhaw";
        String collect = Arrays.stream(input.split(" ")).map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(collect);
    }

    public void sumOfTenNaturalNumber(){
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 1; i<=10;i++){
            l.add(i);
        }

        Integer result = l.stream().reduce((a, b) -> a + b).get();
        System.out.println(result);
    }

    public void stringStartWithNumber(){
        ArrayList<String> l = new ArrayList<>();
        l.add("amandeep");
        l.add("1deepak");
        l.add("ravi");
        l.add("2akash");
        l.add("abhinaw");
        l.add("3ram");

        List<String> collect = l.stream().filter(str -> Character.isDigit(str.charAt(0))).collect(Collectors.toList());
        System.out.println(collect);
    }

    public void duplicateFromArray(){
        int arr1[] = {2,3,3,1,9,2};
        HashSet<Integer> set = new HashSet<>();
        //boxed() is used for convert int to Integer
        Set<Integer> collect = Arrays.stream(arr1).filter(num -> !set.add(num)).boxed().collect(Collectors.toSet());
        System.out.println(collect);
    }

    public void groupByEvenAndOdd(){
        ArrayList<Integer> al =  new ArrayList<>();
        al.add(2);
        al.add(11);
        al.add(30);
        al.add(2);
        al.add(17);
        al.add(18);

        Map<String, List<Integer>> collect = al.stream()
                .collect(Collectors.groupingBy(sum -> sum % 2 == 0 ? "even" : "odd"));
        System.out.println(collect);
    }


    public void groupByVowel(){
        ArrayList<Character> l = new ArrayList<>();
        l.add('a');
        l.add('b');
        l.add('c');
        l.add('e');
        l.add('o');
        l.add('r');

        Map<String, List<Character>> collect = l.stream().collect(Collectors.groupingBy(c -> "aeiou"
                .indexOf(Character.toLowerCase(c)) != -1 ? "Vowels" : "Consonants"));
        System.out.println(collect);
    }

    public void sumOfDigits(){
        int number = 945;
        Integer collect = Arrays.stream(String.valueOf(number).split(""))
                .collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(collect);
    }

     public void findMaxUsingArray(){
         int arr1[] = {2,3,3,1,9,2};
         OptionalInt max = Arrays.stream(arr1).max();
         System.out.println(max);
         System.out.println("Success");
     }

//

}