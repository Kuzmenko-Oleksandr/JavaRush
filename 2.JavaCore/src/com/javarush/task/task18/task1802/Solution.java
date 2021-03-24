package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        int min = 255;
        try(FileInputStream fileInputStream = new FileInputStream(n)) {
            while (fileInputStream.available()>0){
                int bytes = fileInputStream.read();
                if(bytes<min) min = bytes;
            }

        }
        System.out.println(min);
    }
}
