package com.example.java;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        /*
            This is a solution to the Hacker Rank problem Maximum Element Stack.
            The first line of input contains an integer, N for the number of queries.
            The next lines each contain an below mentioned query.

            Query#  Action:
            1       -Push the element into the stack.
            2       -Delete the element present at the top of the stack.
            3       -Print the maximum element in the stack.
         */

/*
        Sample Input:
        10
        1 97
        2
        1 20
        2
        1 26
        1 20
        2
        3
        1 91
        3
                Output : 26 91
*/

        Scanner in = new Scanner(System.in);
        int numOfQuery = in.nextInt();

        Stack<Integer> dataStack = new Stack<Integer>();
        Stack<Integer> maxStack = new Stack<Integer>();

        int maxElement = Integer.MIN_VALUE;
        maxStack.push(maxElement);

        for (int i = 0; i < numOfQuery ; i++) {

            int typeOfElement = in.nextInt();

            //if 1 - Push the element into the stack.
            if (typeOfElement == 1){
                int inputData = in.nextInt();

                if (inputData >= maxStack.peek()){
                    maxStack.push(inputData);
                }

                dataStack.push(inputData);

            } //if 2 - Delete the element present at the top of the stack.
            if(typeOfElement == 2){

                if (dataStack.peek().equals(maxStack.peek())){
                    maxStack.pop();
                }
                dataStack.pop();
            } //if 3 - Print the maximum element in the stack.
            if (typeOfElement == 3){

                System.out.println(maxStack.peek());

            }

        }

    }
}
