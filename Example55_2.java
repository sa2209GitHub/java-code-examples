// Take string from users and remove the white space
//
import java.util.Scanner;

class Example55_2 {

  public static void main(String[] args) {

    // create an object of Scanner
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");

    // take the input
    String input = sc.nextLine();
    System.out.println("Original String: " + input);

    // remove white spaces
    input = input.replaceAll("\\s", "");
    System.out.println("Final String: " + input);
    sc.close();
  }
}
