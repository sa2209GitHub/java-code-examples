// Binary to Decimal Conversion Using parseInt()
//
class Example37_2 {

  public static void main(String[] args) {

    // binary number
    String binary = "01011011";

    // convert to decimal
    int decimal = Integer.parseInt(binary, 2);
    System.out.println(binary + " in bunary " + decimal + " in decimal.");
  }
}
