package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Warmups {

    public static void main(String[] args) {
    }

    /*
    Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod


    less20(18) → true
    less20(19) → true
    less20(20) → false
````*/
    public boolean less20(int n) {
        return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
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
    Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, always
    \with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later, but
    for this problem the value is simply 0.

    word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
    word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
    word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
     */

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map0 = new HashMap();
        for (String s : strings) {
            map0.put(s, 0);
        }
        return map0;
    }

    /*
    Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
    and the value is that string's length.

    wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
    wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
    wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
     */
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> mapLen = new HashMap();
        for (String s : strings) {
            mapLen.put(s, s.length());
        }
        return mapLen;
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

    /*
    Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive --
    then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n)
    {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3
    times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().

    noTeenSum(1, 2, 3) → 6
    noTeenSum(2, 13, 1) → 3
    noTeenSum(2, 1, 14) → 3
     */

    public int noTeenSum(int a, int b, int c) {
        int sum = 0;

        a = fixTeen (a);
        b = fixTeen (b);
        c = fixTeen (c);

        sum = a + b + c;

        return sum;

    }

    /*
    We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
    Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.


    makeChocolate(4, 1, 9) → 4
    makeChocolate(4, 1, 10) → -1
    makeChocolate(4, 1, 7) → 2
     */

    public int makeChocolate(int small, int big, int goal) {
        int smallBarCount = 0;
        int numberOfBigs = Math.abs(goal / 5);
        if (numberOfBigs > big){
            numberOfBigs = big;
        }
        smallBarCount = goal - (numberOfBigs * 5);

        if (smallBarCount <= small){
            return smallBarCount;
        }

        return -1;
    }

    /*
    The classic word-count algorithm: given an array of strings, return a Map<String, Integer>
    with a key for each different string, with the value the number of times that string appears in the array.

    wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
    wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
    wordCount(["c", "c", "c", "c"]) → {"c": 4}
     */

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer> ();
        for (String s:strings) {

            if (!map.containsKey(s)) {
                map.put(s, 1);
            }
            else {
                int count = map.get(s);
                map.put(s, count + 1);
            }
        }
        return map;
    }

    /*
    A sandwich is two pieces of bread with something in between. Return the string that is between the first and
    last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

    getSandwich("breadjambread") → "jam"
    getSandwich("xxbreadjambreadyy") → "jam"
    getSandwich("xxbreadyy") → ""
     */

    public String getSandwich(String str) {
        int firstBread = str.indexOf("bread");
        int lastBread = str.lastIndexOf("bread");

        if (firstBread == lastBread){
            return "";
        }

        return str.substring(firstBread + 5, lastBread);
    }


    //FUNCTIONAL - LISTS
    /*
    Given a list of integers, return a list where each integer is multiplied with itself.

    square([1, 2, 3]) → [1, 4, 9]
    square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
    square([]) → []
     */

    public int fixTeen (int n){
        if (n == 15 || n == 16){
            return n;
        } else if (n >= 13 && n <= 19){
            n = 0;
            return n;
        }
        return n;
    }

    public List<Integer> square(List<Integer> nums) {
        nums = nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        return nums;
    }






}







