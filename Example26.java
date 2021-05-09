// Display Prime Numbers Between two Intervals
//
public class Example26 {

  public static void main(String[] args) {

    int low = 20, high = 50;

    while (low < high) {
      boolean flag = false;

      for(int i = 2; i <= low / 2; ++i) {
        // condition for nonprime number
        if (low % i == 0) {
          flag = true;
          break;
        }
      }
      if (!flag && low != 0 && low != 1)
        System.out.print(low + " ");
      ++low;
    }
  }
}
