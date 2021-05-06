// Check whether a number is even or odd using ternary operator

import java.util.Scanner;

public class Example7_2 {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = reader.nextInt();

    String evenOdd = (num % 2 == 0) ? "even" : "odd";

    System.out.println(num + " is " + evenOdd);
  }
}
