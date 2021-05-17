// Convert byte[] to File
//
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example75_2 {
  
  public static void main(String[] args) {
    
    String path = System.getProperty("user.dir") + "/src/test75_2.txt";
    String finalPath = System.getProperty("user.dir") + "/src/test75_2.out";

    try {
      byte[] encoded = Files.readAllBytes(Paths.get(path));
      Files.write(Paths.get(finalPath), encoded);
    } catch (IOException e) {
    }
  }
}
