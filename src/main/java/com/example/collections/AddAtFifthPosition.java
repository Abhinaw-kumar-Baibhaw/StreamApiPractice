package com.example.collections;

import java.util.ArrayList;

public class AddAtFifthPosition {
    public void addAtFifthPosition(){
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=1;i<=10;i++){
            l.add(i);
        }
        l.add(5,12);
        System.out.println(l);
    }

    public static void main(String[] args) {
        AddAtFifthPosition a = new AddAtFifthPosition();
        a.addAtFifthPosition();
    }
}
