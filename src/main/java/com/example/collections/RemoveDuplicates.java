package com.example.collections;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("Enter how many numbers do you want");
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" numbers");
        for (int i = 0 ; i < arr.length ; i ++){
            arr[i]=s.nextInt();
        }
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i< arr.length;i++){
            h.add(arr[i]);
        }
        System.out.println(h);
    }
}
