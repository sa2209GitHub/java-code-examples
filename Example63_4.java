// Get Current Date time in localized style
//
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Example63_4 {

  public static void main(String[] args) {
    LocalDateTime current = LocalDateTime.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
    String formatted = current.format(formatter);

    System.out.println("Current Date is: " + formatted);
  }
}

