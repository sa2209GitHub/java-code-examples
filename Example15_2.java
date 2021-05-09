// Find Factorial of a number using BigInteger

import java.math.BigInteger;

public class Example15_2 {

  public static void main(String[] args) {

    int num = 30;
    BigInteger factorial = BigInteger.ONE;
    for(int i = 1; i <= num; ++i) {
      factorial = factorial.multiply(BigInteger.valueOf(i));
    }
    System.out.printf("Factorial of %d = %d", num, factorial);
  }
}
