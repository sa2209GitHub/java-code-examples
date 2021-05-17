// char to int using parseInt() method
//
class Example87_3 {

  public static void main(String[] args) {

    // create char variables
    char a = '5';
    char b = '9';

    // convert char variables to int
    // use parseInt()
    int num1 = Integer.parseInt(String.valueOf(a));
    int num2 = Integer.parseInt(String.valueOf(b));

    // print numeric value
    System.out.println(num1);        // 5
    System.out.println(num2);       // 9
  }
}
