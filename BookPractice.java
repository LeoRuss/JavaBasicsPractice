import static java.lang.System.out;

public class BookPractice {

  private static void forLoopPractice(String[] a) {
    TestRun: for (int i = 0; i < a.length; i++) {
      if (i > 0)
        System.out.print(", ");
      if (i == 2)
        continue TestRun;
      out.print(a[i]);
    }
  }

  /////////////////////////////////////////
  private static double square(double x) {
    return x * x;
  }

  ////////////////////////////////////////
  static void printSquareRoot(double x) {
    if (x < 0)
      return;
    out.println(Math.sqrt(x));
  }

  ////////////////////////////////////////
  private static double factorial(int x) {
    if (x < 0)
      throw new IllegalArgumentException("x must be >= 0");
    double fact;
    for (fact = 1.0; x > 1; fact *= x, x--)
      /* */;
    return fact;
  }

  /////////////////////////////////////////
  private static long powerMthd(int x, int y) {
    long z = 1;

    for (int i = 0; i < y; i++) {
      z = z * x;
    }
    return z;
  }

  /////////////////////////////////////////
  private static void outputs() {
    String[] words = { "Russel", "Leon", "Amorphy" };

    forLoopPractice(words);
    square(9);
    printSquareRoot(24);
    out.println();
    out.println(powerMthd(-9, 2));

    ////////////////////////////////////////////////
    String[] response = new String[2];
    response[0] = "Yes";
    response[1] = "No";

    String question = "Do you want to quit ?";
    out.println(question + " (" + response[0] + "/" + response[1] + "): ");

    /////////////////////////////////////////////////
    int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23 };
    int sumOfPrimes = 0;

    // for (int i = 0; i < primes.length; i++) {
    // String result = "Sum of primes " + primes[i] + " + " + sumOfPrimes;
    // sumOfPrimes += primes[i];
    // System.out.println(result + " = " + sumOfPrimes);
    // }

    // for ( int p : primes) sumOfPrimes += p;
    // System.out.println(sumOfPrimes);

    String letter = "o";
    String s = "hello";
    String t = "hell" + letter;
    if ( s.equals(t)) {
      out.println("equal");
    }
  /////////////////////////////////////////
  public static void main(String[] args) {

    outputs();

    // try {
    // System.out.println(factorial(-1));
    // } finally {
    // // TODO: handle exception
    // System.out.println("Input number greater than 0");
    // }
  }
}