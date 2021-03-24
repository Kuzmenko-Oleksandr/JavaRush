package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        try(FileInputStream fis = new FileInputStream(a);
            FileOutputStream fos = new FileOutputStream(b)){

            List<Integer> inputBytes = new ArrayList<>();

            while (fis.available() > 0){

               inputBytes.add(fis.read());
            }

            Collections.reverse(inputBytes);

            for (Integer aBytes: inputBytes) {
                fos.write(aBytes);
            }
        }
    }
}
