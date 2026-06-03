package edu.cnm.deepdive;

/// Implements the convert method for constructing the FizzBuzz representation of a numeric value.
///
/// Rules of FizzBuzz:
///
///   - An integer which is not divisible by either 3 or 5 is converted to the [String] representation of that number.
///   - An integer which is divisible by 3, but not by 5, is represented as "Fizz".
///   - An integer which is divisible by 5, but not by 3, is represented as "Buzz".
///   - An integer which is divisible by both 3 and 5 is represented as "FizzBuzz".
public class FizzBuzz {

  public static final String FIZZ_RESULT = "Fizz";
  public static final String BUZZ_RESULT = "Buzz";
  public static final String FIZZ_BUZZ_RESULT = FIZZ_RESULT + BUZZ_RESULT;

  /// Converts an int to its equivalent FizzBuzz string representation.
  ///
  /// @param value Input to be converted.
  /// @return FizzBuzz representation of `value`.
  /// @throws IllegalArgumentException if `value < 0`.
  public static String convert(int value) throws IllegalArgumentException {
    if (value < 0) {
      throw new IllegalArgumentException();
    }
    String result = "";
    if (value % 3 == 0) {
      result = FIZZ_RESULT;
    }
    if (value % 5 == 0) {
      result += BUZZ_RESULT;
    }
    return result.isEmpty() ? String.valueOf(value) : result;
  }

}
