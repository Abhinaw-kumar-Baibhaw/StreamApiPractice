package com.example.collections;

import java.util.HashMap;
import java.util.Scanner;

public class SpecificKeyExist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many numbers do you want");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" numbers");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
           hm.put(i,arr[i]);
        }
        System.out.println(hm.get(arr[4]));
    }
}
