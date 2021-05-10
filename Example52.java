// Add Two Complex Numbers
//
public class Example52 {

  double real;
  double imag;

  public Example52(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  public static void main(String[] args) {
    Example52 n1 = new Example52(2.3, 4.5),
              n2 = new Example52(3.4, 5.0),
              temp;

    temp = add(n1, n2);

    System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
  }

  public static Example52 add(Example52 n1, Example52 n2) {

    Example52 temp = new Example52(0.0, 0.0);

    temp.real = n1.real + n2.real;
    temp.imag = n1.imag + n2.imag;

    return(temp);
  }
}
