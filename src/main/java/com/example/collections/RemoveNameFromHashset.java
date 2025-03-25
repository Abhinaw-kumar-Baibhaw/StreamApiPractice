package com.example.collections;

import java.util.HashSet;

public class RemoveNameFromHashset {
    public void removeNameFromHashset(){
        HashSet<String> h = new HashSet<>();
        h.add("abhinaw");
        h.add("baibhaw");
        h.add("aakash");
        h.add("gaurav");
        h.add("rahul");
        h.add("ravi");
        System.out.println(h);
        h.remove("baibhaw");
        System.out.println(h);
     }

    public static void main(String[] args) {
        RemoveNameFromHashset r = new RemoveNameFromHashset();
        r.removeNameFromHashset();
    }
}
