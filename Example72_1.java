// Create String from file
//
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Example72_1 {

  public static void main(String[] args) throws IOException {

    String path = System.getProperty("user.dir") + "/src/test72_1.txt";
    Charset encoding = Charset.defaultCharset();

    List<String> lines = Files.readAllLines(Paths.get(path), encoding);
    System.out.println(lines);
  }
}
