package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat;
    public static class Cat{
        public String name;
    }
    static {
        Cat cat = new Cat();
        cat.name = "шарик";
        Solution.cat = cat;
        System.out.println(cat.name);
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

    }
}
