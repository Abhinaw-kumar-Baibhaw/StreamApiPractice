package com.example.collections;

import java.util.ArrayList;

public class SortTheListInAscOrder {
    public void sortTheListInAscOrder(){
        ArrayList<String> list = new ArrayList<>();
        list.add("F");
        list.add("G");
        list.add("A");
        list.add("D");
        list.add("B");
        list.add("C");
        list.stream().sorted().forEach(System.out::println);
    }

    public static void main(String[] args) {
        SortTheListInAscOrder s = new SortTheListInAscOrder();
        s.sortTheListInAscOrder();
    }
}
