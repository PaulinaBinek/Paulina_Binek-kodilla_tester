package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {
    private GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldThrowWhenNumbersEmpty(Set<Integer> numbers) {
        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/SetSize.csv", numLinesToSkip = 1)
    public void shouldThrowWhenNotSixNumbersAreDrawn(String numbers) {
        Set<Integer> notSixSet = convertStringToIntegerSet(numbers);
        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(notSixSet));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/ValidNumbers.csv", numLinesToSkip = 1)
    public void shouldNotThrowWhenNumbersCorrect(String numbers) {
        Set<Integer> validNumbers = convertStringToIntegerSet(numbers);

        assertDoesNotThrow( () -> machine.howManyWins(validNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/InvalidNumbers.csv", numLinesToSkip = 1)
    public void shouldThrowWhenNumbersOutOfRange(String numbers) {
        Set<Integer> invalidNumbers = convertStringToIntegerSet(numbers);
        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(invalidNumbers));

    }

    private Set<Integer> convertStringToIntegerSet(String numbers) {
        Set<Integer> inputNumbers = Arrays.stream(numbers.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        return inputNumbers;
    }
}