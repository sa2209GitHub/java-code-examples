// Convert Array to Set
//
import java.util.*;

public class Example70_1 {

  public static void main(String[] args) {

    String[] array = { "a", "b", "c" };
    Set<String> set = new HashSet<>(Arrays.asList(array));

    System.out.println("Set: " + set);
  }
}