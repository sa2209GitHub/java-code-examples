// Milliseconds to Seconds/Minutes Using Mathematical Formula
//
class Example64_2 {

  public static void main(String[] args) {

    long milliseconds = 10000000;

    long seconds = (milliseconds / 1000);
    System.out.println(milliseconds + " Milliseconds = " + seconds + " Seconds");

    long minutes = (milliseconds / 1000) / 60;
    System.out.println(milliseconds + " Milliseconds = " + minutes + " Minutes");
  }
}
