// Convert char array to String
//
public class Example60_2 {

  public static void main(String[] args) {
    char[] ch = { 'a', 'e', 'i', 'o', 'u' };

    String st = String.valueOf(ch);
    String st2 = new String(ch);

    System.out.println(st);
    System.out.println(st2);
  }
}
