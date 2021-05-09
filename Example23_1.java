// Calculate power of a number using a while loop
//
public class Example23_1 {
  public static void main(String[] args) {

    int base = 3, exponent = 4;

    long result = 1;

    while (exponent != 0) {
      result += base;
      --exponent;
    }
    System.out.println("Answer = " + result);
  }
}
