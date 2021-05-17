// Rename a File in Java
//
import java.io.File;

class Example84 {

  public static void main(String[] args) {

    // create a file obect
    File file = new File("Example84.old");

    // create a file
    try {
      file.createNewFile();
    } catch (Exception e) {
      e.getStackTrace();
    }

    // create an object that contains the new name of file
    File newFile = new File("Example84.new");

    // change the name of file
    boolean value = file.renameTo(newFile);

    if (value) {
      System.out.println("The name of the file is changed.");
    } else {
      System.out.println("The name cannot be changed.");
    }
  }
}
