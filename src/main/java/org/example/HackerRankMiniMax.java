package org.example;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class HackerRankMiniMax {
    //PROBLEM
    /*

    Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
    Then print the respective minimum and maximum values as a single line of two space-separated long integers.

    Example arr [1,3,5,7,9]

    The minimum sum is 16 and the maximum sum is 24. The function prints

    16 24
    Function Description

    Complete the miniMaxSum function in the editor below.

    miniMaxSum has the following parameter(s):

    arr: an array of  integers
    Print

    Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

    Input Format

    A single line of five space-separated integers.

    Constraints


    Output Format

    Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

    Sample Input

    1 2 3 4 5
    Sample Output

    10 14
    Explanation

    Hints: Beware of integer overflow! Use 64-bit Integer.

    Need help to get started? Try the Solve Me First problem
     */

    public static void main(String[] args){
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        miniMaxSum(test);
    }
//SOLUTION
public static void miniMaxSum(List<Integer> arr) {

    long max = arr.stream()
            .max(Integer::compareTo)
            .get();

    long min = arr.stream()
            .min(Integer::compareTo)
            .get();

    long sum = 0;
    for (int i = 0; i < 5; i++) {
        sum = sum + arr.get(i);
    }

    long maxSum = sum - min;
    long minSum = sum - max;
    System.out.println(minSum + " " + maxSum);
}

}


