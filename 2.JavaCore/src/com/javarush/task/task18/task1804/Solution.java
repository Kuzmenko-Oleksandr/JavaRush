package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int[] bytes = new int[256];
        try(FileInputStream fis = new FileInputStream(n)) {
            while (fis.available() > 0) {
                bytes[fis.read()] += 1;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int bytesCount: bytes) {
            if (bytesCount > 0 && bytesCount < min)
                min = bytesCount;

        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < bytes.length ; i++) {
            if (bytes[i] == min)
                result.add(i);

        }
        for (Integer resultItem:result) {
            System.out.print(resultItem + " ");
        }
    }
}
