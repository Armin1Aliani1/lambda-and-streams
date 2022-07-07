package com.lambdasAndStreams.test6OrSixLambdaStreamPipeline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LambdaApplicationForTestSix {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Armin");
        stringList.add("Reza");
        stringList.add("Mohsen");
        stringList.add("Ali");
        stringList.add("Amin");

        /*Predicate<String> stringPredicate = s -> s.startsWith("A");*/

        // Method filter is intermediate operation and returns a stream

        /*Stream<String> stringStream = stringList.stream().filter(stringPredicate);
        Consumer<String> stringConsumer = c -> System.out.println(c);*/

        // For each element that (stringStream) points to, call the accept method that (stringConsumer) has on each of them.

        /*stringStream.forEach(stringConsumer);*/

        // For each element that (stringStream) points to, call the accept method that (stringConsumer) has on each of them.

        stringList.stream()
                .filter(s -> s.startsWith("A"))
                .forEach(c -> System.out.println(c));

    }
}
