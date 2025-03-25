package com.example.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheListInDescOrder {
    public void sortTheListInDescOrder(){
        ArrayList<String> list = new ArrayList<>();
        list.add("F");
        list.add("G");
        list.add("A");
        list.add("D");
        list.add("B");
        list.add("C");
        List<String> collect = list.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void main(String[] args) {
        SortTheListInAscOrder s = new SortTheListInAscOrder();
        s.sortTheListInAscOrder();
    }
}
