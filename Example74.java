// Append text to an existing file using FileWriter
//
import java.io.FileWriter;
import java.io.IOException;

public class Example74 {

  public static void main(String[] args) {

    String path = System.getProperty("user.dir") + "/src/test74.txt";
    String text = "ADDED TEXT ";

    try {
      FileWriter fw = new FileWriter(path, true);
      fw.write(text);
      fw.close();
    } catch (IOException e) {
    }
  }
}
