package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
import java.util.Arrays;
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer counter = 0;

        for(int i = 0; i <= objectArray.length -1; i++){

            if(objectArray[i] == objectToCount){

                counter++;
            }
        }

        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        Integer occurrences = getNumberOfOccurrences(objectArray,objectToRemove);

        Object[] resultArr =new Object[objectArray.length - occurrences];
        int n = 0;
        for(Object o : objectArray){

            if(o != objectToRemove){
                resultArr[n++] = o;
            }

        }

        return resultArr;

    }
    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
    int counter = 0;
    Object mscommon = objectArray[0];
    Object tempObj;
    int tempcounter;

        for (int i = 0; i <objectArray.length; i++) {
            tempObj = objectArray[i];
            tempcounter = 0;

            for (int j = 0; j <objectArray.length; j++) {

                if(tempObj == objectArray[j]){
                    tempcounter++;
                }


            }
            if(tempcounter > counter){
                mscommon = tempObj;
                counter = tempcounter;
            }
        }
        return mscommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int counter = objectArray.length;
        Object mscommon = objectArray[0];
        Object tempObj;
        int tempcounter;

        for (int i = 0; i <objectArray.length; i++) {
            tempObj = objectArray[i];
            tempcounter = 0;

            for (int j = 0; j <objectArray.length; j++) {

                if(tempObj == objectArray[j]){
                    tempcounter++;
                }


            }
            if(tempcounter < counter){
                mscommon = tempObj;
                counter = tempcounter;
            }
        }
        return mscommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        return null;
    }
}
