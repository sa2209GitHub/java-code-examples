// Java Program to Convert double to String using format()
//
class Example98_4 {
  public static void main(String[] args) {

    // create a double variable
    double num = 99.99;

    // convert double to string using format()
    String str = String.format("%f", num);

    System.out.println(str);    // 99.990000
  }
}
