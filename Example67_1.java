// Convert the Arraylist into Array
//
import java.util.ArrayList;

class Example67_1 {

  public static void main(String[] args) {

    ArrayList<String> languages = new ArrayList<>();

    // Add element in the ArrayList
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");

    System.out.println("ArrayList: " + languages);

    // Create a new array of String type
    String[] arr = new String[languages.size()];

    // Convert ArrayList into the string array
    languages.toArray(arr);
    System.out.print("Array: ");
    for (String item : arr) {
      System.out.print(item + ", ");
    }
  }
}
