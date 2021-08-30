package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> provideBmiForTesting() {
        return Stream.of(
                Arguments.of(new Person(1.68, 30), "Very severely underweight"),
                Arguments.of(new Person(1.68, 45), "Severely underweight"),
                Arguments.of(new Person(1.68, 50), "Underweight"),
                Arguments.of(new Person(1.68, 60), "Normal (healthy weight)"),
                Arguments.of(new Person(1.68, 72), "Overweight"),
                Arguments.of(new Person(1.68, 90), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.68, 100), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.68, 120), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.68, 140), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.68, 160), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.68, 300), "Obese Class VI (Hyper Obese)")
        );
    }
}