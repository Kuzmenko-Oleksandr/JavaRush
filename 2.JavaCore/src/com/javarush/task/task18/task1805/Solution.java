package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        Set<Integer> bytes = new TreeSet<>();
        try(FileInputStream fis = new FileInputStream(n)){
            while (fis.available() > 0 ){
                bytes.add(fis.read());
            }
        }
        for (Integer newBytes: bytes) {
            System.out.print(newBytes + " ");
            
        }
    }
}
