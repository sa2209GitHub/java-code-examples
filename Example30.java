// Armstrong Numbers Between Two Integers
//
public class Example30 {

  public static void main(String[] args) {

    int low = 999, high = 99999;

    for (int number = low + 1; number < high; ++number) {

      if (chackArmstrong(number))
        System.out.print(number + " ");
    }
  }

  public static boolean chackArmstrong(int num) {
    int digits = 0;
    int result = 0;
    int originalNumber = num;

    // number of digits calculation
    while (originalNumber !=0) {
      originalNumber /= 10;
      ++digits;
    }

    originalNumber = num;

    // result contains sum of nth power of its digits
    while (originalNumber != 0) {
      int remainder = originalNumber % 10;
      result += Math.pow(remainder, digits);
      originalNumber /= 10;
    }

    if (result == num)
      return true;

    return false;
  }
}
