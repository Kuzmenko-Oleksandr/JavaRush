package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String mode = args[0];
        if(!(mode.equals("-e")|| mode.equals("-d"))) return;
        try(FileInputStream fis = new FileInputStream(args[1]); FileOutputStream fos = new FileOutputStream(args[2])) {
            if(mode.equals("-e")){
                while (fis.available() > 0){
                    fos.write(fis.read() + 32);
                }
                
            }else {
                while (fis.available()>0){
                    fos.write(fis.read() - 32);
                }
            }
            
        }

    }

}
