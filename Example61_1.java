// Check if int Array contains a given value
//
class Example61_1 {

  public static void main(String[] args) {

    int[] num = { 1, 2, 3, 4, 5 };
    int toFind = 2;
    boolean found = false;

    for (int n : num) {
      if (n == toFind) {
        found = true;
        break;
      }
    }

    if (found)
      System.out.println(toFind + " is found.");
    else
      System.out.println(toFind + " is not found.");
  }
}
