package com.lambdasAndStreams.test4OrForeLambdaSupplier;

import java.util.Scanner;
import java.util.function.Supplier;

public class LambdaApplicationForTestFore {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Supplier<Integer> integerSupplierOne = () -> {
            return 2 * 2;
        };
        System.out.println("2*2 = " + integerSupplierOne.get());

        System.out.println("Please enter your name : ");
        String strName = scanner.nextLine();
        Supplier<Boolean> booleanSupplier = () -> strName.length() == 5;
        System.out.println("This name is 5 character : " + booleanSupplier.get());

        Supplier<Integer> integerSupplierTwo = () -> strName.length() - 2;
        System.out.println("Length this name minus 2 characters is : " + integerSupplierTwo.get());

        Supplier<String> stringSupplierOne = () -> strName.toUpperCase();
        System.out.println("This is upper case your name : " + stringSupplierOne.get());

        Supplier<String> stringSupplierTwo = () -> strName.toLowerCase();
        System.out.println("This is lower case your name : " + stringSupplierTwo.get());

    }
}
