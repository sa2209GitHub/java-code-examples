// Java Program to Check Palindrome String
//
class Example24_1 {

  public static void main(String[] args) {

    String str = "Radar", reverseStr = "";

    int strLenght = str.length();

    for (int i = (strLenght - 1); i >= 0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }
  }
}
