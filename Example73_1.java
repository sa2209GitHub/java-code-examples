// Append text to existing file
//
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Example73_1 {

  public static void main (String[] args) {

    String path = System.getProperty("user.dir") + "/src/test73_1.txt";
    String text = "ADDED TEXT ";

    try {
      Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
    } catch (IOException e) {
    }
  }
}

