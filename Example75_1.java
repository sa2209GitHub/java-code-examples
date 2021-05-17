// Convert File to byte[]
//
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Example75_1 {

  public static void main(String[] args) {
    
    String path = System.getProperty("user.dir") + "/src/test75_1.txt";
    
    try {
      byte[] encoded = Files.readAllBytes(Paths.get(path));
      System.out.println(Arrays.toString(encoded));
      } catch (IOException e) {
      }
   }
}
