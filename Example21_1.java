// Count Number of Digits in an Integer using while loop
//
public class Example21_1 {
  public static void main(String[] args) {

    int count = 0, num = 0003452;

    while (num != 0) {
      num /= 10;
      ++count;
    }
    System.out.println("Number of digits: " + count);
  }  
}
