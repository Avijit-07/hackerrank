package co.uk.hackerrank.java;

/*
Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

string s: a time in  hour format
Returns

string: the time in  hour format
Input Format

A single string  that represents a time in -hour clock format (i.e.:  or ).

Constraints

All input times are valid

https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-one
 */

/**
 * remove AM & PM
 * does lowercase am & pm matter?
 * no need to handle invalid times
 * null check or empty string
 * 12:00:00AM -- 12:00:00PM (noon)
 *  AM
 *      (12:00 == 00:00)
 *      1:00 == 1:00
 *      11:00 == 11:00
 *  PM
 *      (12:00 == 12:00)
 *      (1:00:00 == 12 + 1 == 13:00:00
 *      11:00:00 == 12 + 11 == 23:00:00
 *
 *
 *
 */
public class TimeConversion {

    public static String timeConversion(String s) {

        return null;
    }
}