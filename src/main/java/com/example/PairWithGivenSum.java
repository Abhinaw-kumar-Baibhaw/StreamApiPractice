package com.example;

import java.util.Arrays;
import java.util.HashMap;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {10, 15, 3, 7};
        int target = 17;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(!h.containsKey(arr[i])){
                h.put(arr[i],i);
            }
        }
        int res[] = new int[2];
        for (int i=0;i<arr.length;i++){
            int result = target-arr[i];
            if(h.containsKey(result)){
                res[0]=i;
                res[1] = h.get(result);
                break;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
