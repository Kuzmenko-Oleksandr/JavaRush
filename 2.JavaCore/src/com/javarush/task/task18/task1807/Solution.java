package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int commaCount = 0;
        try(FileInputStream fileInputStream = new FileInputStream(s)){
            while (fileInputStream.available() > 0 ){
                if (fileInputStream.read() == 44) commaCount++;
            }

        }System.out.println(commaCount);
    }
}
