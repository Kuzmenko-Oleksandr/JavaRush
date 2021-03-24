package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String n = bufferedReader.readLine();
            int[] bytes = new int[256];
            try (FileInputStream fileInputStream = new FileInputStream(n)){
                while (fileInputStream.available()>0) {
                    bytes[fileInputStream.read()] += 1; 
                } 
            }
                int max = 0;
                for (int bytesC : bytes) {
                    if (bytesC > max) max = bytesC;
                    
                }
                ArrayList<Integer> result = new ArrayList<>();
                for (int i = 0; i < bytes.length; i++) {
                    if(bytes[i] == max) result.add(i);
                    
                }
                for (Integer resultItem: result)
                    System.out.print(resultItem + " ");
                    
    }
}
