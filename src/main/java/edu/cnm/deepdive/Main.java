package edu.cnm.deepdive;

public class Main {

  void main() {
    for (int i = 1; i <= 100; i++) {
      String output = FizzBuzzView.render(i, FizzBuzz.convert(i));
      System.out.println(output);
    }
  }

}
