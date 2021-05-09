// Display Fibonacci series up to a given number

class Example17_3 {

  public static void main(String[] args) {

    int n = 100, firstTerm = 0, secondTerm = 1;

    System.out.println("Fibonacci Series Upto " + n + ": ");

    while (firstTerm <= n) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}