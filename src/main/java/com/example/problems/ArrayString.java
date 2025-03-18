package com.example.problems;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayString {


    public void problem1(){
        String s = "Hello World";
        int v=0,c=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                v++;
            }
            else{
                c++;
            }
        }
        System.out.println("vowels : "+v+" consonants : "+c);
    }

    public void problem2(){
        String s = "kanak";
        String s1 = "";
        for(int i = s.length()-1; i>=0;i--){
            s1 = s1 + s.charAt(i);
        }
        if(s.equals(s1)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }

    public void  problem3(){
        String s = "hello world";
        char remove = 'o';
        s = s.replace(String.valueOf(remove),"");
        System.out.println(s);
    }

    public void problem4(){
        String s = "This is a Java program";
        int c = 0;
        String[] ch = s.split(" ");
        System.out.println(ch.length);
    }


    public void problem5(){
        String s1 = "listen";
        String s2 = "silent";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] s = s1.toCharArray();
        char[]  s3 = s2.toCharArray();
        Arrays.sort(s);
        Arrays.sort(s3);
        if(Arrays.equals(s,s3)){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }


    public void problem6(){
        String s = "hello world";
        char rep = 'o';
        s = s.replace(String.valueOf(rep),"@");
        System.out.println(s);
    }

    public void problem7(){
        String s = "abcbccbcbaaa";
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!h.containsKey(s.charAt(i))){
                h.put(s.charAt(i),1);
            }
            else
            {
                h.put(s.charAt(i),h.get(s.charAt(i))+1);
            }
        }
        for(Character key : h.keySet()){
            System.out.println(key +" "+h.get(key));
        }
    }

    public void problem8(){
        StringBuffer s = new StringBuffer("abhinaw");
        s.reverse();
        System.out.println(s);
    }

    public void problem9(){
        int arr[]={4,2,-6,1,3,5,2,-3,4,2};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(max);
    }

    public void problem10(){
        int n = 2;
        int c=0;
        if(n<=1) {
            System.out.println("Not Prime");
        }
        for(int i = 2; i< Math.sqrt(n);i++){
            if(n%i==0){
                c++;
                break;
            }
        }
        if(c>0){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }

    public void problem11(){
        int a = 0, b=1;
        System.out.print(a +" "+b+" ");
        for(int i=1;i<10;i++){
            System.out.print(a+b+" ");
            int temp = a+ b;
            a=b;
            b=temp;
        }
    }

    public void problem12(){
        String s = "abcabcbb";
        int maxLength = 0;
        String currentSubstring = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(currentSubstring.indexOf(ch) == -1) {
                currentSubstring = currentSubstring + ch;
                maxLength = Math.max(maxLength, currentSubstring.length());
            } else {
                i = i - currentSubstring.indexOf(ch);
                currentSubstring = "";
            }
        }
        System.out.println("Longest substring without repeating characters: " + maxLength);
    }

    public void problem13(){
        String s = "Java is a programming language";
        String[] words = s.split(" ");
        String result = "";
        for(int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }
        System.out.println("Reversed words: " + result.trim());
    }

    public void problem14(){
        int[] arr = {2, 0, 4, 5, 6, 1, 3};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num : arr) {
            if(num > largest) {
                secondLargest = largest;
                largest = num;
            } else if(num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second largest element: " + secondLargest);
    }

    public void problem15(){
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        if(s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            System.out.println("Strings are rotations of each other.");
        } else {
            System.out.println("Strings are not rotations of each other.");
        }
    }

    public static void main(String[] args) {
        ArrayString as = new ArrayString();
//        as.problem1();
//        as.problem2();
//        as.problem3();
//        as.problem4();
//        as.problem5();
//        as.problem6();
//        as.problem7();
//        as.problem8();
//        as.problem9();
//        as.problem10();
//        as.problem11();
//        as.problem11();
//        as.problem12();
//        as.problem13();
//        as.problem14();
        as.problem15();
    }
}