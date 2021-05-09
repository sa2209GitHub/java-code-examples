// Check if a Number is Positive or Negative using if...else

public class Example12 {

  public static void main(String[] args) {

    double number = 12.3;

    // true if number is less than 0
    if (number < 0.0)
      System.out.println(number + " is a negative number.");

    // true if number is greather than 0
    else if (number > 0.0)
      System.out.println(number + " is a positive number.");

    // if both tet expression is evaluted to false
    else
      System.out.println(number + " is 0.");
  }
}
