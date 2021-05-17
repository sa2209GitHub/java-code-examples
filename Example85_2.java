// List files present in a Directory excluding Subdirectories
//
import java.io.File;

class Example85_2 {

  public static void main(String[] args) {

    try {

      File folder = new File("/home/sa/Workshop/java-code-examples");

      // list all the files
      File[] files = folder.listFiles();

      for (File file : files) {
        if (file.isFile()) {
          System.out.println(file);
        }
      }
    } catch (Exception e) {
      e.getStackTrace();
    }
  }
}
