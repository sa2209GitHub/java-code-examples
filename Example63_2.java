// Get Current date and time with pattern
//
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example63_2 {

  public static void main(String[] args) {
    LocalDateTime current = LocalDateTime.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    String formated = current.format(formatter);

    System.out.println("Current Date and Time is: " + formated);
  }
}
