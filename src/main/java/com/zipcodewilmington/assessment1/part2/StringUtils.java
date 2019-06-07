package com.zipcodewilmington.assessment1.part2;

import static com.zipcodewilmington.assessment1.part1.BasicStringUtils.camelCase;
import static com.zipcodewilmington.assessment1.part1.BasicStringUtils.reverse;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {


        return sentence.split(" ");
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {

String[]arr = getWords(sentence);
        return arr[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {

String firstWord = getFirstWord(sentence);// getFirstword is calling from the method above meaning less work to do
StringBuilder sBuilder = new StringBuilder(firstWord);
//above you're making a new string builder with the first word ONLY

    return sBuilder.reverse().toString();// <-- converting string builder back to regular string.
    //     ^^ reversing string builder(the first word).
    // You're now using a reverse method that StringBuilder has and .toString is converting the string builder back to a regular string
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {

        String revWord = reverseFirstWord(sentence);


        return revWord.substring(0,1).toUpperCase() + revWord.substring(1);
    }


    /**
     * @param str   string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex (String str, int index) {



        return str.substring(0, index) + str.substring(index + 1);
    }
}


