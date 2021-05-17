// Lookup enum by string value
//
public class Example78 {

  public enum TextStyle {
    BOLD, ITALICS, UNDERLINE, STRIKETHROUGH
  }

  public static void main(String[] args) {

    String style = "Bold";

    TextStyle textStyle = TextStyle.valueOf(style.toUpperCase());

    System.out.println(textStyle);
  }
}
