package com.example.collections;

import java.util.HashSet;

public class CheckNameExistInSet {
    public void checkNameExistInSet(){
        HashSet<String> h = new HashSet<>();
        h.add("abhinaw");
        h.add("baibhaw");
        h.add("aakash");
        h.add("gaurav");
        h.add("rahul");
        h.add("ravi");
        for(int i=0;i<h.size();i++){
            if(h.contains("gaurav")){
                System.out.println("exists");
                break;
            }
            else{
                System.out.println("Does not exists");
            }
        }
    }

    public static void main(String[] args) {
        CheckNameExistInSet c = new CheckNameExistInSet();
        c.checkNameExistInSet();
    }
}
