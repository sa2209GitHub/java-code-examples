// Generate Multiplication Table using while loop

public class Example16_2 {

  public static void main(String[] args) {

    int num = 9, i = 1;
    while(i <= 10)
    {
      System.out.printf("%d * %d = %d \n", num, i, num * i);
      i++;
    }
  }
}
