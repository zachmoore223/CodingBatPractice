package org.example;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class HackerRank {
    //PROBLEM
    /*

    Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.

    Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

    Example

    There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:

    0.400000
    0.400000
    0.200000
    Function Description

    Complete the plusMinus function in the editor below.

    plusMinus has the following parameter(s):

    int arr[n]: an array of integers
    Print
    Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.

    Input Format

    The first line contains an integer, , the size of the array.
    The second line contains  space-separated integers that describe .

    Constraints



    Output Format

    Print the following  lines, each to  decimals:

    proportion of positive values
    proportion of negative values
    proportion of zeros
    Sample Input

    STDIN           Function
    -----           --------
    6               arr[] size n = 6
    -4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]
    Sample Output

    0.500000
    0.333333
    0.166667
    Explanation

    There are  positive numbers,  negative numbers, and  zero in the array.
    The proportions of occurrence are positive: , negative:  and zeros: .
     */

    public static void main(String[] args){
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(-2);
        test.add(-1);
        test.add(0);
        test.add(1);
        plusMinus(test);
    }
//SOLUTION
    public static void plusMinus(List<Integer> arr) {
        int positiveIntCount = 0;
        int negativeIntCount = 0;
        int zeroIntCount = 0;
        int arrayLength = arr.size();

        for(int i = 0; i < arrayLength; i++ ){
            if(arr.get(i) >= 1){
                positiveIntCount++;
            }
            if(arr.get(i) < 0){
                negativeIntCount++;
            }
            if(arr.get(i) == 0){
                zeroIntCount++;
            }
        }
        double positivePortion =  (( double ) positiveIntCount) / arrayLength;
        double negativePortion =  (( double ) negativeIntCount) / arrayLength;
        double zeroPortion =  (( double ) zeroIntCount) / arrayLength;

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(6);



        System.out.println(nf.format(positivePortion));
        System.out.println(nf.format(negativePortion));
        System.out.println(nf.format(zeroPortion));
    }
}


