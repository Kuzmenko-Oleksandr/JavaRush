package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
           String n = br.readLine();
           int max = 0;
           try(FileInputStream fis = new FileInputStream(n)){
               while(fis.available()>0)
               {
               int bytes = fis.read();
               if (bytes > max) max = bytes;

           }
       }
        System.out.println(max);

    }
}
