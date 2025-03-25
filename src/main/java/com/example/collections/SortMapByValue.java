package com.example.collections;

import java.util.*;


public class SortMapByValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many numbers do you want");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" numbers");
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],i);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort(Map.Entry.comparingByValue());
    }
}