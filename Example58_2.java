// Round a Number using Decimal Format
//
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Example58_2 {

  public static void main(String[] args) {
    double num = 1.34567;
    DecimalFormat df = new DecimalFormat("#.###");
    df.setRoundingMode(RoundingMode.CEILING);

    System.out.println(df.format(num));
  }
}
