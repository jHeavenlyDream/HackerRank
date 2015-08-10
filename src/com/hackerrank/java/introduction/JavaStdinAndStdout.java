package com.hackerrank.java.introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*


Problem Statement

In most of the problems in Hackerrank, you need to read input from stdin or standard input and write your output in stdout or standard output.

One way to take input from stdin is to use Scanner class and reading from System.in. Alternatively, you can use BufferedReader class.

You can write your output to stdout simply using System.out.printf function.

In this problem you just need to read the inputs from stdin and print them in stdout.

Input Format:
There will be three lines of input. The first line will have an integer. The second line will have a double number. The last line will consist of a string.

Output Format:
Print the string in the first line, the double in the second line and the integer in the third line. See the sample output for exact formatting.

Note: Don't worry about the precision of the double, you can simply print it using System.out.println. There might be leading or trailing spaces in the string, keep it exactly as it is.

Sample Input

42
3.1415
Welcome to Hackerrank Java tutorials!

Sample Output

String: Welcome to Hackerrank Java tutorials!
Double: 3.1415
Int: 42


 */
public class JavaStdinAndStdout {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        double d = in.nextDouble();
        in.nextLine();
        String s = in.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + number);

    }
}
