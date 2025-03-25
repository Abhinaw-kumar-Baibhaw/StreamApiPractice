package com.example.collections;

import java.util.HashMap;
import java.util.Scanner;

public class CountOccurance {
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
        for(int i =0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        System.out.println(hm);
    }
}
