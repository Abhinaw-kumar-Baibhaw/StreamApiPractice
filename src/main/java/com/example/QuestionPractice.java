package com.example;

import java.util.*;
import java.util.stream.Collectors;

public class QuestionPractice {

    public void binarySearch() {
        int arr[] = {1, 3, 5, 7, 9, 2};
        Arrays.sort(arr);
        int search = 3;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == search) {
                System.out.println(mid);
                break;
            } else if (arr[mid] > search) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

    public void swapWithoutThirdVariable() {
        String firstName = "abhinaw";
        String lastName = "baibhaw";
        firstName = firstName + lastName;
        lastName = firstName.substring(0, firstName.length() - lastName.length());
        firstName = firstName.substring(lastName.length());
        System.out.println("firstName = " + firstName + ", lastName = " + lastName);
    }

    public void sumIn2D() {
        int arr[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }


    public void maxIn2D() {
        int arr[][] = {{2, 3, 1}, {9, 23, 12}, {18, 21, 11}};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                max = Math.max(max, arr[i][j]);
            }
        }
        System.out.println(max);
    }

    public void merge2SortedArray() {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8};
        int merge[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merge[k] = arr1[i];
                i++;
                k++;
            } else {
                merge[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < arr1.length) {
            merge[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            merge[k] = arr2[j];
            k++;
            j++;
        }

        for (int l = 0; l < merge.length; l++) {
            System.out.print(merge[l] + " ");
        }
    }

    public void removeDuplicateInArraylist() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(2);
        l.add(2);
        l.add(1);
        l.add(3);
        l.add(1);
        l.add(1);
        HashSet<Integer> h = new HashSet<>(l);
        l.clear();
        l.addAll(h);
        System.out.println(l);
    }

    public void reverseArrayList() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
    }

    public void rotateArray(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotateArrayMain() {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;
        rotateArray(arr, 0, k - 1);
        rotateArray(arr, k, arr.length - 1);
        rotateArray(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void frequencyInArrayList() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(2);
        l.add(2);
        l.add(1);
        l.add(3);
        l.add(1);
        l.add(1);
        HashMap<Integer, Integer> h = new HashMap<>();
        for (Integer element : l) {
            h.put(element, h.getOrDefault(element, 0) + 1);
        }
        System.out.println(h);
    }

    public void pickNumber() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(101);
        l.add(123);
        l.add(234);
        l.add(876);
        l.add(102);
        l.add(789);
        List<Integer> collect = l.stream().filter(i -> Integer.toString(i).startsWith("1")).collect(Collectors.toList());
        System.out.println(collect);
    }
    public void swap(){
        StringBuffer s1 = new StringBuffer("Abhinaw");
        StringBuffer s2 = new StringBuffer("Baibhaw");
        s1.append(s2);
        System.out.println(s1.substring(0,7));
        System.out.println(s1.substring(7,14));
    }
}
