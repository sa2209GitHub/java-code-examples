// Check if an array contains the given value using Stream
//
import java.util.stream.IntStream;

class Example60_2 {

  public static void main(String[] args) {
    int[] num = { 1, 2, 3, 4, 5 };
    int toFind = 7;

    boolean found = IntStream.of(num).anyMatch(n -> n == toFind);

    if(found)
      System.out.println(toFind + " is found.");
    else
      System.out.println(toFind + " is not found.");
  }
}
