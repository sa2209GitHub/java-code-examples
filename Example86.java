// Copy files using i/o streams
//
import java.io.FileInputStream;
import java.io.FileOutputStream;

class Example86 {

  public static void main(String[] args) {

    byte[] array = new byte[50];

    try {
      FileInputStream sourceFile = new FileInputStream("Example86.in");
      FileOutputStream destFile = new FileOutputStream("Example86.out");

      // reads all data from Example86.in
      sourceFile.read(array);

      // writes all data to Example86.out
      destFile.write(array);
      System.out.println("The Example86.in file is copied to Example86.out.");

      // closes the stream
      sourceFile.close();
      destFile.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
  }
}

