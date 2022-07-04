package com.lambdasAndStreams.test2OrTwoLambdaPracticeFunction;

import java.util.Scanner;

public class LambdaApplicationForTestTwo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        FunctionalInterfaceWithTypeIntForAverage<Float, Float, Float> functionalInterfaceWithTypeIntForAverage = (x, y) -> {
            return (x + y) / 2;
        };
        System.out.println("Please enter a first number for average : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter a second number for average : ");
        int secondNumber = scanner.nextInt();
        System.out.println("This is average your numbers : " + functionalInterfaceWithTypeIntForAverage.average((float) firstNumber, (float) secondNumber));

    }
}
