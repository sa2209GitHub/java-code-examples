// Create a new Directory using the mkdirs() method
//
import java.io.File;

class Example83_2 {

  public static void main(String[] args) {

    // creates a file object in the current path
    File file = new File("Java Tutorial//dir83_2");

    // tires to create a new directory
    boolean value = file.mkdirs();

    if (value) {
      System.out.println("The new directory is created.");
    } else {
      System.out.println("The directory already exists.");
    }
  }
}
