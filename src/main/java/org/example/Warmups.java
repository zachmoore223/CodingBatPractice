package org.example;

public class Warmups {

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
/*
    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
            stringMatch("xxcaazz", "xxbaaz") → 3
    stringMatch("abc", "abc") → 2
    stringMatch("abc", "axc") → 0
*/

    public static int stringMatch(String a, String b){
        int count = 0;
        int shortestLength = Math.min(a.length(), b.length());
        //go through the length of the shortest string
        for (int i = 0; i < shortestLength-1; i++){
            //compare index with string a and b, if they match, check to see if next one matches as well
            //if they do, add 1 to count
            if (a.charAt(i) == b.charAt(i)){
                if (a.charAt(i+1) == b.charAt(i+1)){
                    count++;
                }
            }
        }
        return count;
    }

}







