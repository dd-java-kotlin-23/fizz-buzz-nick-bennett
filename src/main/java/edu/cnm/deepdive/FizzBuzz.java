package edu.cnm.deepdive;

import java.util.EnumSet;
import java.util.Set;

/// Implements the convert method for constructing the FizzBuzz representation of a numeric value.
///
/// Rules of FizzBuzz:
///
///   - An integer which is not divisible by either 3 or 5 is converted to the [String]
/// representation of that number.
///   - An integer which is divisible by 3, but not by 5, is represented as "Fizz".
///   - An integer which is divisible by 5, but not by 3, is represented as "Buzz".
///   - An integer which is divisible by both 3 and 5 is represented as "FizzBuzz".
public class FizzBuzz {

  /// Converts an int to its equivalent FizzBuzz [Set<Result>] representation.
  ///
  /// @param value Input to be converted.
  /// @return FizzBuzz representation of `value`.
  /// @throws IllegalArgumentException if `value < 0`.
  public static Set<Result> convert(int value) throws IllegalArgumentException {
    if (value < 0) {
      throw new IllegalArgumentException();
    }
    Set<Result> result = EnumSet.noneOf(Result.class);
    if (value % 3 == 0) {
      result.add(Result.FIZZ);
    }
    if (value % 5 == 0) {
      result.add(Result.BUZZ);
    }
    return result;
  }

  public enum Result {
    FIZZ, BUZZ
  }

}
