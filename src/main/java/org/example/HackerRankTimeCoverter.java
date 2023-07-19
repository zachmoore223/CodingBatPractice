package org.example;

import java.util.ArrayList;
import java.util.List;

public class HackerRankTimeCoverter {
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
       System.out.println(miniMaxSum("07:05:45AM"));
       System.out.println(miniMaxSum("07:05:45PM"));
       System.out.println(miniMaxSum("12:00:00AM"));
    }
//SOLUTION
public static String miniMaxSum(String s) {
    //turn the string into an array, ie 07:13:53AM becomes timeArray[0,7,:,1,3,:,5,3,A,M]
    String[] timeArray = s.split("");
    //our return string that will be built.
    String militaryTime = "";

    //algo to get whether time is AM or PM.
    //am boolean will be turned either true or false
    int timeArrayEnd = timeArray.length - 2;
    String amPmCheck = timeArray[timeArrayEnd];
    boolean am = true;
    if (amPmCheck.equals("P")) {
        am = false;
    }

    //get first two digits of the string
    String firstTwoLetters = timeArray[0] + timeArray[1];
    int firstTwoNums = Integer.parseInt(firstTwoLetters);
    int secondNum = Integer.parseInt(timeArray[2]);
    int militaryFirstTwo = 0;

    if (firstTwoNums < 12 && am == true){
        for (int i = 0; i < timeArrayEnd; i++){
            militaryTime = militaryTime + timeArray[i];
        }

    }
    return militaryTime;
}


}


