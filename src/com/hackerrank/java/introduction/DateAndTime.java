/*
The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
For example, if you are given the date , the method should return as the day on that date.


Input Format

A single line of input containing the space separated month, day and year, respectively, in format.

Constraints

Output Format

Output the correct day in capital letters.

Sample Input

08 05 2015

Sample Output

WEDNESDAY

Explanation

The day on August th was WEDNESDAY.

*/

package com.hackerrank.java.introduction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class DateAndTime {

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        String result = "";
        switch (dayOfWeek){
            case 2: result = "MONDAY";break;
            case 3: result =  "TUESDAY";break;
            case 4: result =  "WEDNESDAY";break;
            case 5: result =  "THURSDAY";break;
            case 6: result =  "FRIDAY";break;
            case 7: result =  "SATURDAY";break;
            case 1: result =  "SUNDAY";break;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findDay(8, 5, 2999));
    }
}
