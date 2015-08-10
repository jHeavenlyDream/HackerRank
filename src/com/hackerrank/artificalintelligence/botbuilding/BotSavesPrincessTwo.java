package com.hackerrank.artificalintelligence.botbuilding;

import java.util.Scanner;

/*
Problem Statement

In this version of "Bot saves princess", Princess Peach and bot's position are randomly set. Can you save the princess?

Task

Complete the function nextMove which takes in 4 parameters - an integer N, integers r and c indicating the row & column position of the bot and the character array grid - and outputs the next move the bot makes to rescue the princess.

Input Format

The first line of the input is N (<100), the size of the board (NxN). The second line of the input contains two space separated integers, which is the position of the bot.

Grid is indexed using Matrix Convention

The position of the princess is indicated by the character 'p' and the position of the bot is indicated by the character 'm' and each cell is denoted by '-' (ascii value: 45).

Output Format

Output only the next move you take to rescue the princess. Valid moves are LEFT, RIGHT, UP or DOWN

Sample Input

5
2 3
-----
-----
p--m-
-----
-----

Sample Output

LEFT

Resultant State

-----
-----
p-m--
-----
-----

Explanation

As you can see, bot is one step closer to the princess.

Scoring
Your score for every testcase would be (NxN minus number of moves made to rescue the princess)/10 where N is the size of the grid (5x5 in the sample testcase). Maximum score is 17.5

 */
public class BotSavesPrincessTwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,x,y;
        n = in.nextInt();
        x = in.nextInt();
        y = in.nextInt();
        in.useDelimiter("\n");
        String board[] = new String[n];


        for(int i = 0; i < n; i++) {
            board[i] = in.next();
        }

        nextMove(n,x,y,board);
    }

    static void nextMove(int n, int x, int y, String [] board){
        int botRow = 0;
        int botCol = 0;
        int princessRow = 0;
        int princessCol = 0;
        boolean step = false;

        for(int i = 0; i < n; i++ )
            for(int j = 0; j < board[i].length(); j++){
                if (board[i].charAt(j) == 'p') {
                    princessRow = i;
                    princessCol = j;
                }
            }

        for(int i = 0; i < n; i++ )
            for(int j = 0; j <  board[i].length(); j++){
                if (board[i].charAt(j) == 'm') {
                    botRow = i;
                    botCol = j;
                }

            }

        if (botRow > princessRow){
            System.out.println("UP");
            step = true;
        }
        else if(botRow < princessRow){
            System.out.println("DOWN");
            step = true;
        }

        if (step == false){
            if (botCol > princessCol){
                System.out.println("LEFT");
            }
            else if(botCol < princessCol){
                System.out.println("RIGHT");

            }
        }
    }

}
