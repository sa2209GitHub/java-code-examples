// Get the current working directory using Path
//
import java.nio.file.Paths;

public class Example68_2 {

  public static void main(String[] args) {

    String path = Paths.get("").toAbsolutePath().toString();
    System.out.println("Working Directory = " + path);
  }
}
