package com.lambdasAndStreams.test1OrOneLambdaFunction;

import java.util.Scanner;
import java.util.function.Function;

public class LambdaApplicationForTestOne {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Function<Integer, String> functionOne = t -> {
            if (t % 2 == 0) {
                return t + " Is even number";
            } else {
                return t + " Is odd number";
            }
        };

        /*System.out.println(functionOne.apply(5));
        System.out.println(functionOne.apply(2));*/

        System.out.println("Please enter a first number for average : ");
        int firstNumber = scanner.nextInt();

        Function<Integer, Integer> functionTwo = integer -> {
            return (integer + firstNumber) / 2;
        };
        System.out.println("Please enter a second number for average : ");
        int secondNumber = scanner.nextInt();
        System.out.println(functionTwo.apply(secondNumber));

        System.out.println(functionOne.apply(functionTwo.apply(secondNumber)));

    }
}
