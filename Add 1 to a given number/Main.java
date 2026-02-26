import java.util.function.IntUnaryOperator;

public class AddOne {
  public static void main(String[] args) {
    // input
    int n = 6;

    // adding 1 to a given number and print the output
    // one line solution
    IntUnaryOperator addOne = x -> x + 1;
    System.out.println(addOne.applyAsInt(n));
  }
}