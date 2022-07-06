package com.lambdasAndStreams.test5OrFiveLambdaPractice;

import java.util.Scanner;
import java.util.function.Predicate;

public class LambdaApplicationForTestFive {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("For an array of strings, this program sorts the words by their number of letters");

        System.out.println("Please enter a word : ");
        String strOne = scanner.next();
        Predicate<String> stringPredicate = (a) -> a.substring(0, 1).equals(a.substring(a.length() - 1));
        System.out.println(stringPredicate.test("Are the first and last letters of the entered word the same : " + strOne));

    }
}
