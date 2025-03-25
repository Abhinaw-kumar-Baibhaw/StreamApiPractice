package com.example.collections;

import java.util.ArrayList;

public class RemoveElementAtIndex {
    public void removeElementAtIndex(){
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=1;i<=10;i++){
            l.add(i);
        }
        l.remove(2);
        System.out.println(l);
    }

    public static void main(String[] args) {
        RemoveElementAtIndex r = new RemoveElementAtIndex();
        r.removeElementAtIndex();
    }
}
