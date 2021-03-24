package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        SimpleObject<String> stringObject = new StringObject();
    }
    public static class StringObject implements SimpleObject<String>{
        public SimpleObject<String> getInstance(){
            return null;
        }
    }

    interface SimpleObject<String> {
        SimpleObject<String> getInstance();
    }

}
