package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {



        return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {




        /*int count = 0;
        String[] answer = new String[str.length];
        for (int i = array.length - 1 ; i >= 0; i--){
            answer[count] = array[i];
            count++;



        }
        */return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        String rev = reverse(str);
        String result = rev.substring(0,1).toUpperCase() + rev.substring(1);

        return result;
    }



    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

            return str.substring(1,str.length()-1);
        }





    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        return null;
    }
}
