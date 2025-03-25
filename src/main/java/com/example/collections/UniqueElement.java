package com.example.collections;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!h.containsKey(arr[i])){
                h.put(arr[i],1);
            }else{
                h.put(arr[i],h.get(arr[i])+1);
            }
        }
        for(Integer key : h.keySet()){
            if(h.get(key)==1){
                System.out.println(key);
                break;
            }
        }

    }
}
