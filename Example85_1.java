// Java Program to List all files
//
import java.io.File;

class Example85_1 {

  public static void main(String[] args) {

    // creates a file object
    File file = new File("/home/sa/Workshop/java-code-examples/");

    // return an array of all files
    String[] fileList = file.list();

    for (String str : fileList) {
      System.out.println(str);
    }
  }
}
