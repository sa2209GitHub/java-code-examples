// char to int using getNumericValue() method
//
class Example87_2 {

  public static void main(String[] args) {

    // create char variables
    char a = '5';
    char b = '9';

    // convert char variables to int
    // use getNumericValue()
    int num1 = Character.getNumericValue(a);
    int num2 = Character.getNumericValue(b);

    // print the numeric value of characters
    System.out.println(num1);         // 5
    System.out.println(num2);         // 9
  }
}
