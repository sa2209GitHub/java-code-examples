import java.util.Scanner;

public class Example1 {

  public static void main(String[] args) {
    
    // Creates a reader instance which takes
    // Input from standard input -- keyboard
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a number: ");

    // nextInt() reads the next integer from the keyboard
    int number = reader.nextInt();

    // println() prints the following line to the output screen
    System.out.println("You entered number: " + number);
  }
}
