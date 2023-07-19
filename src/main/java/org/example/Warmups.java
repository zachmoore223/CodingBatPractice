package org.example;

import java.util.List;
import java.util.stream.Collectors;

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

    /*
    Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
    stringX("xxHxix") → "xHix"
    stringX("abxxxcd") → "abcd"
    stringX("xabxxxcdx") → "xabcdx"
     */

    public static String stringX(String a){
        String newString = "";
        for (int i = 0; i < a.length(); i++){
            if(a.charAt(i) != 'x'){
                newString = newString + a.substring(i, i+1);
            }
            if(a.charAt(i) == 'x') {
                if(i == a.length()-1 || i == 0){
                    newString = newString + a.substring(i, i+1);
                }
            }
        }
        return newString;
    }

        /*
    Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2,
    just sum up the elements that exist, returning 0 if the array is length 0.
    sum2([1, 2, 3]) → 3
    sum2([1, 1]) → 2
    sum2([1, 1, 1, 1]) → 2
     */

    public int sum2(int[] nums) {
        int sum = 0;
        if (nums.length >= 2 ){
            sum = nums[0] + nums[1];
        } else if (nums.length == 1) {
            sum = nums[0];
        }
        return sum;
    }

    //LOGIC 2 PROBLEM
    /*

    For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20.
    Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints,
    a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num)
    {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
    roundSum(16, 17, 18) → 60
    roundSum(12, 13, 14) → 30
    roundSum(6, 4, 4) → 10
     */

    public int roundSum(int a, int b, int c) {
        int sum = round10(a) + round10(b) + round10(c);
        return sum;
    }

    public int round10(int num) {
        int modNumb = num % 10;

        if (modNumb >=5 ){
            return num + 10 - modNumb;
        }

        return num - modNumb;
    }

    /*
    Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far",
    differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.


    closeFar(1, 2, 10) → true
    closeFar(1, 2, 3) → false
    closeFar(4, 1, 3) → true
     */

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a-b) <= 1 && Math.abs(a-c) >= 2 && Math.abs(b-c) >= 2){
            return true;
        }
        if (Math.abs(a-c) <= 1 && Math.abs(a-b) >= 2 && Math.abs(b-c) >= 2){
            return true;
        }
        return false;

    }

    /*
   Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

    blackjack(19, 21) → 21
    blackjack(21, 19) → 21
    blackjack(19, 22) → 19
     */

    public int blackjack(int a, int b) {
        //if both are above 21, return 0
        if(a > 21 && b > 21){
            return 0;
        }
        //nested ternary, first if a is greater than 21, return b
        //if b is greater than21, return a
        //if both false, return the larger number
        return (a>21)? b : (b>21)? a : Math.max(a,b);
    }


    //FUNCTIONAL - LISTS
    /*
    Given a list of integers, return a list where each integer is multiplied with itself.

    square([1, 2, 3]) → [1, 4, 9]
    square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
    square([]) → []
     */

    public List<Integer> square(List<Integer> nums) {
        nums = nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        return nums;
    }






}







