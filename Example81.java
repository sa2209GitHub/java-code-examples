// Sort ArrayList of Custom Objects By Property
//
import java.util.*;

public class Example81 {

  private String customProperty;

  public Example81(String property) {
    this.customProperty = property;
  }

  public String getCustomProperty() {
    return this.customProperty;
  }

  public static void main(String[] args) {

    ArrayList<Example81> list = new ArrayList<>();
    list.add(new Example81("Z"));
    list.add(new Example81("A"));
    list.add(new Example81("B"));
    list.add(new Example81("X"));
    list.add(new Example81("Aa"));

    list.sort((o1, o2) -> o1.getCustomProperty().compareTo(o2.getCustomProperty()));

    for (Example81 obj : list) {
      System.out.println(obj.getCustomProperty());
    }
  }
}
