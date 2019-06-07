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
    String newString = str.substring(0,1).toUpperCase() + str.substring(1);
    // Create new string| create substring starting at 0 & ending at 1|Upper case the first index and add rest of string.

        return newString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        String newString = "";

        for (int i = str.length() -1; i >= 0; i--) {

            newString += str.charAt(i);

        }


        return newString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

       String newString = reverse(str);// reverse(str) is calling method above
       String camelString = camelCase(newString); //camelCase is calling method above


        return camelString;

    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String subStr = str.substring(1, str.length() -1);//<-- does not include last index
//      Creates a new string and makes current string a substring staring at the second index(1) and ending at the last index (not including index)
            return subStr;
        }





    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] eachChar = str.toCharArray();

        for (int i = 0; i < eachChar.length; i++) {

            //char j = eachChar[i];
            if(Character.isUpperCase(eachChar[i])){

                eachChar[i] = Character.toLowerCase(eachChar[i]);
            }
            else {
                eachChar[i] = Character.toUpperCase(eachChar[i]);
            }

        }


        return new String(eachChar);
    }
}
