package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\abhin\\OneDrive\\Desktop\\POC's\\e-commerce.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            bw.write("I added this line in this file");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
