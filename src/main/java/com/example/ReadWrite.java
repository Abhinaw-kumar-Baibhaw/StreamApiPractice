package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWrite {
    public static void main(String[] args) {
     String path = "C:\\Users\\abhin\\OneDrive\\Desktop\\POC's\\e-commerce.txt";
     String path1 = "C:\\Users\\abhin\\OneDrive\\Desktop\\POC's\\e-commerce1.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path));
         BufferedWriter bw = new BufferedWriter(new FileWriter(path1))){
            String line = "";
            while((line = br.readLine())!=null){
                bw.write(line);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
