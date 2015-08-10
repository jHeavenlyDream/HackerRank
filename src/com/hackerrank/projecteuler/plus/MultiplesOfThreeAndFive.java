package com.hackerrank.projecteuler.plus;

import java.util.Scanner;

/**
 * Created by Ivanov on 07.08.2015.
 */
public class MultiplesOfThreeAndFive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfLines = input.nextInt();
        double sum;
        double test;

        for(int i = 0; i < numOfLines; i++){
            sum = 0;
            test = input.nextDouble() - 1;

            sum += SumByNumber(test, 3);
            sum += SumByNumber(test, 5);
            sum -= SumByNumber(test, 15); //remove overlapping numbers

            System.out.println(Math.round(sum));
        }

    }

    static double SumByNumber(double a, double b){
        //sum of numbers below a that are multiples of b
        double last = a - (a % b);
        double result;
        if(last % 2 == 1){
            result = last * ((last + b)/(b * 2));
        } else {
            result = last * (last/(b * 2)) + last / 2;
        }
        return result;
    }
}

