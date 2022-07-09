package com.lambdasAndStreams.test6OrSixLambdaStreamPipeline;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaApplicationForTestSix {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Armin");
        stringList.add("Reza");
        stringList.add("Mohsen");
        stringList.add("Ali");
        stringList.add("Amin");
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

        System.out.println();

        List<String> stringListTwo = stringList.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());

        // collect : It turns what we gave it into a list

        for (String element : stringListTwo) {
            System.out.println(element);
        }

        System.out.println();

        Set<String> stringListThree = stringList.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toSet());

        for (String elementTwo : stringListThree) {
            System.out.println(elementTwo);
        }

        System.out.println();

        String str = stringList.stream().collect(Collectors.joining(","));
        System.out.println(str);

        System.out.println();

        /*List<String> myStringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");*/
        List<String> stringListFore = Arrays.asList("a", "b", "c", "d");
        Function<String, String> myFunction = input -> input.toUpperCase();
        List<String> stringListFive = stringListFore.stream()
                .map(myFunction)
                .collect(Collectors.toList());

        for (String elementTwo : stringListFive) {
            System.out.println(elementTwo);
        }

        System.out.println();

        List<String> stringListSix = stringListFore.stream()
                .map(input -> input.toUpperCase())
                .collect(Collectors.toList());

        for (String elementTwo : stringListSix) {
            System.out.println(elementTwo);
        }

        System.out.println();

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> integerListOne = integerList.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        for (Integer elementThree : integerListOne) System.out.println(elementThree);

        System.out.println();

        String[] arrays = {"Armin", "Arian", "Ali", "Asghar"};
        Stream stream = Stream.of(arrays);
        stream.filter(s -> s.equals("Asghar")).forEach(c -> System.out.println(c));

        System.out.println();

//        stream.limit(3).forEach(q -> System.out.println(q));

//        stream.map(q -> q.equals(q.toString()));

    }
}
