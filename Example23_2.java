// Calculate the power of a number using a for loop
//
public class Example23_2 {

  public static void main (String[] args) {

    int base = 3, exponent = 4;

    long result = 1;

    for (;exponent != 0; --exponent) {
      result *= base;
    }
    System.out.println("Answer = " + result);
  }
}
