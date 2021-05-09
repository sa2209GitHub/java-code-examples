// Java Program to Check Alphabet using isAlphabetic() Method

class Example13_3 {

  public static void main(String[] args) {

    // declare a variable
    char c = 'a';

    // check if c is an alphabet
    if (Character.isAlphabetic(c)) {
      System.out.println(c + " is an alphabet.");
    }
    else {
      System.out.println(c + " is not an aphabet.");
    }
  }
}
