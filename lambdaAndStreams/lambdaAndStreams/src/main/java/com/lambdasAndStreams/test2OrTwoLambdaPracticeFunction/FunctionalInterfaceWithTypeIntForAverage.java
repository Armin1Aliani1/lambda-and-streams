package com.lambdasAndStreams.test2OrTwoLambdaPracticeFunction;

@FunctionalInterface
public interface FunctionalInterfaceWithTypeIntForAverage<T, U, R> {
    R average(T t, U u);
}
