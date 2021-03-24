package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String key = null;
        while ((key = br.readLine())!= null){
            Movie movie = MovieFactory.getMovie(key);
            if (movie == null){
                return;
            }
            System.out.println(movie.getClass().getSimpleName());
        }
    }


    static class MovieFactory {
        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            switch (key){
                case "soapOpera":
                    movie = new SoapOpera();
                    break;
                case "cartoon" :
                    movie = new Cartoon();
                    break;
                case "thriller" :
                    movie = new Thriller();
                    break;
            }
            //напишите тут ваш код, пункты 5,6
            return movie;
        }
    }

    static abstract class Movie {

    }

    static class SoapOpera extends Movie {
    }

    //Напишите тут ваши классы, пункт 3
    static class Cartoon extends Movie{

    }
    static class Thriller extends Movie{

    }
}
