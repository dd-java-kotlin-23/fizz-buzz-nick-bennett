package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import edu.cnm.deepdive.FizzBuzz.Result;
import java.util.EnumSet;
import java.util.Set;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

  @ParameterizedTest
  @ValueSource(ints = {-1, -3, -5, -15, -100, Integer.MIN_VALUE})
  void convert_negative(int value) {
    try {
      FizzBuzz.convert(value);
      fail("Expected IllegalArgumentException not thrown.");
    } catch (IllegalArgumentException e) {
      // This is expected; no need to handle the exception further.
    }
  }

  @ParameterizedTest
  @ValueSource(ints = {1, 7, 101, Integer.MAX_VALUE})
  void convert_neither(int value) {
    assertEquals(Set.of(), FizzBuzz.convert(value));
  }

  @ParameterizedTest
  @ValueSource(ints = {3, 9, 12, 99, Integer.MAX_VALUE - 1})
  void convert_fizz(int value) {
    assertEquals(EnumSet.of(Result.FIZZ), FizzBuzz.convert(value));
  }

  @ParameterizedTest
  @ValueSource(ints = {5, 10, 50, Integer.MAX_VALUE - 2})
  void convert_buzz(int value) {
    assertEquals(EnumSet.of(Result.BUZZ), FizzBuzz.convert(value));
  }

  @ParameterizedTest
  @ValueSource(ints = {0, 30, 75, Integer.MAX_VALUE - 7})
  void convert_fizzBuzz(int value) {
    assertEquals(EnumSet.of(Result.BUZZ, Result.FIZZ), FizzBuzz.convert(value));
  }

}