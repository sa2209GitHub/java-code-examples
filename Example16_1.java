// Generate Multiplication Table using for loop

public class Example16_1 {

  public static void main(String[] args) {

    int num = 5;
    for(int i = 1; i <= 10; ++i)
    {
      System.out.printf("%d * %d = %d \n", num, i, num * i);
    }
  }
}
