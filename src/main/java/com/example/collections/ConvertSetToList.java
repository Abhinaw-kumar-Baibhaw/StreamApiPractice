package com.example.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertSetToList {
    public void convertSetToList(){
        HashSet<String> h = new HashSet<>();
        h.add("abhinaw");
        h.add("baibhaw");
        h.add("aakash");
        h.add("gaurav");
        h.add("rahul");
        h.add("ravi");
        ArrayList<String> l = new ArrayList<>(h);
        System.out.println(l);
    }

    public static void main(String[] args) {
        ConvertSetToList c = new ConvertSetToList();
        c.convertSetToList();
    }
}
