package edu.cnm.deepdive;

import edu.cnm.deepdive.FizzBuzz.Result;
import java.util.Map;
import java.util.Set;

public class FizzBuzzView {

  private static final Map<Set<Result>, String> LOOKUP_TABLE = Map.of(
      Set.of(Result.FIZZ), "Fzzzzzzz",
      Set.of(Result.BUZZ), "Bzzzzzzz",
      Set.of(Result.BUZZ, Result.FIZZ), "Fizzy-Buzzy"
  );

  public static String render(int value, Set<Result> state) {
    return LOOKUP_TABLE.getOrDefault(state, String.valueOf(value));
  }
}
