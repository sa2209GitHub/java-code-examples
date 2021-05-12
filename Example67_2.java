// Convert Array to ArrayList
//
import java.util.Arrays;
import java.util.ArrayList;

class Example67_2 {

  public static void main(String[] args) {

    // create an array
    String[] array = { "Java", "Python", "C" };
    System.out.println("Array: " + Arrays.asList(array));

    // convert array to arraylist
    ArrayList<String> languages = new ArrayList<>(Arrays.asList(array));
  }
}
