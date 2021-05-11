// Convert char to String
//
public class Example60_1 {

  public static void main(String[] args) {
    char ch = 'c';
    String string = Character.toString(ch);
    // Alternatively
    // string = String.valueOf(ch);

    System.out.println("The string is: " + string);
  }
}
