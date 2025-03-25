package com.example.collections;

import java.util.ArrayList;

public class ReplaceElementOnIndex {
    public void replaceElementOnIndex(){
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=1;i<=10;i++){
            l.add(i);
        }
        l.set(3,12);
        System.out.println(l);
    }

    public static void main(String[] args) {
        ReplaceElementOnIndex r = new ReplaceElementOnIndex();
        r.replaceElementOnIndex();
    }
}
