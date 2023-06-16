package org.example;
import java.util.Scanner;
public class Warmup1 {

    public static void main(String[] args) {
    }

    /*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
*/


    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation){
            return true;
        }
        else {
            return false;
        }
    }

    /*
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o'
and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
     */

    public static String startOz(String str) {
        String returnValue = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            returnValue = returnValue + "o";
        }

        if (str.length() >= 2 && str.charAt(1) == 'z'){
            returnValue = returnValue + "z";
        }

        return returnValue;

    }



}







