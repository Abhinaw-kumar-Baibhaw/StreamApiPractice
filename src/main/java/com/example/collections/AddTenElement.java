package com.example.collections;

import java.util.ArrayList;

public class AddTenElement {
   public void addTenElement(){
       ArrayList<Integer> l = new ArrayList<>();
       for(int i=1;i<=10;i++){
           l.add(i);
       }
       System.out.println(l);
   }

    public static void main(String[] args) {
        AddTenElement a = new AddTenElement();
        a.addTenElement();
    }
}
