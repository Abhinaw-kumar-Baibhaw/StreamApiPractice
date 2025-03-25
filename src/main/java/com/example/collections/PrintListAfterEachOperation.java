package com.example.collections;

import java.util.ArrayList;

public class PrintListAfterEachOperation {
    public void printListAfterEachOperation(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("F");
        list.add("G");
        list.set(3,"Z");
        System.out.println(list);
    }

    public static void main(String[] args) {
        PrintListAfterEachOperation p = new PrintListAfterEachOperation();
        p.printListAfterEachOperation();
    }

}
