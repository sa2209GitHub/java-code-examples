// Create String from a file
//
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example72_2 {

  public static void main(String[] args) throws IOException {

    String path = System.getProperty("user.dir") + "/src/test72_2.txt";
    Charset encoding = Charset.defaultCharset();

    byte[] encoded = Files.readAllBytes(Paths.get(path));
    String lines = new String(encoded, encoding);
    System.out.println(lines);
  }
}
